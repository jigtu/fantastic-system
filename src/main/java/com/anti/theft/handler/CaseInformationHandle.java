package com.anti.theft.handler;

import com.alibaba.fastjson.JSONObject;
import com.anti.common.entity.BaseResponse;
import com.anti.common.ljy.FaceRecognition;
import com.anti.common.util.Base64Util;
import com.anti.common.util.SaiFuTeUtil;
import com.anti.theft.cache.CaseCache;
import com.anti.theft.cache.PhotoCache;
import com.anti.theft.entity.CaseInformation;
import com.anti.theft.entity.CaseInformationExample;
import com.anti.theft.entity.CaseRelation;
import com.anti.theft.entity.CaseRelationExample;
import com.anti.theft.service.CaseInformationService;
import com.anti.theft.service.CaseRelationService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 报警流程Controller
 *
 * @author ZiQiang
 */
@Controller
@RequestMapping("/api/alarm")
public class CaseInformationHandle extends BaseHandler {

    private static Logger logger = LoggerFactory.getLogger(CaseInformationHandle.class);

    @Resource
    private CaseInformationService caseInformationService;

    @Resource
    private CaseCache caseCache;

    @Resource
    private PhotoCache photoCache;

    @Resource
    private CaseRelationService caseRelationService;

    /**
     * 报警人假体检测接口
     *
     * @param file   视频
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/alarmPeopleUpload")
    public BaseResponse livingUpload(@RequestParam MultipartFile file, @RequestParam String openid) {

        logger.info("我要报警openid:" + openid);
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            //获取文件名
            String fileName = file.getOriginalFilename();
            String imageBase64;
            boolean flag = false;
            for (String format : videoFormat) {
                assert fileName != null;
                if (fileName.contains(format)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                //生成文件存储目录
                String filePath = uploadPath + File.separator + openid + File.separator + alarm + File.separator + Clock.systemUTC().millis();
                File appUserFile = new File(filePath);
                logger.info("视频目录" + filePath);
                if (!appUserFile.exists()) {
                    boolean mkdirs = appUserFile.mkdirs();
                    logger.info("创建文件夹：" + filePath + " :" + mkdirs);
                }
                //文件存储路径
                filePath = filePath + File.separator + fileName;
                //转存文件
                file.transferTo(new File(filePath));
                //假体检测
                String result = FaceRecognition.prosthesisCheck(prosthesisUrl, filePath, prosthesisKey, prosthesisSecret);
                JSONObject parseObject = JSONObject.parseObject(result);
                Integer code = (Integer) parseObject.get("code");
                logger.info("假体检测结果：" + code);
                if (code != 0) {
                    return ajaxFail(parseObject.get("info"));
                }
                //项目目录生成抓拍照片
                JSONObject jsonObject = parseObject.getJSONObject("data");
                imageBase64 = (String) jsonObject.get(photo);

                fileName = fileName.substring(0, fileName.lastIndexOf(".")) + ".jpg";
                //操作完成，删除视频
                File deleteFile = new File(filePath);
                boolean delete = deleteFile.delete();
                logger.info("删除视频：" + delete);
            } else {//上传的是图片直接转换成Base64编码存入缓存中
                imageBase64 = Base64Util.getImageBase64(file);
            }
            //在本地生成图片
            String photoPath = uploadPath + File.separator + alarm + File.separator + System.currentTimeMillis() + (int) ((Math.random() * 9 + 1) * 100);
            File appUserFile = new File(photoPath);
            logger.info("图片目录" + photoPath);
            if (!appUserFile.exists()) {
                boolean mkdirs = appUserFile.mkdirs();
                logger.info("创建文件夹:" + mkdirs);
            }
            Base64Util.generateImage(imageBase64, photoPath + File.separator + fileName);
            //向缓存中添加抓拍照的照片信息
            CaseInformation caseInformation = new CaseInformation();
            caseInformation.setAlarmPeopleOpenid(openid);
            caseInformation.setIsAgree("1");
            caseInformation.setAlarmChannel(1);
            caseInformation.setAlarmPeopleName(fileName);
            caseCache.setCaseCache(caseInformation);
            //缓存图片的Base64编码
            photoCache.setPhotoCache(alarm, openid, photo, imageBase64);
            Map<String, Object> map = new HashMap<>(1);
            map.put("photoPath", photoPath + File.separator + fileName);
            logger.info("上传成功");
            return ajaxSucc(map, "上传成功");
        } catch (Exception e) {
            logger.error("上传失败", e);
            return ajaxFail("上传失败");
        }
    }

    /**
     * 报警人身份证拍照国徽上传
     *
     * @param file   身份证国徽照
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/idCardBackUpload")
    public BaseResponse idCardBackUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
        logger.info("我要报警openid:" + openid);
        try {
            logger.info("证件照国徽一面上传：开始");
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            //文件名
            String fileName = file.getOriginalFilename();
            //向缓存中添加抓拍照的照片信息
            CaseInformation caseInformation = caseCache.getCaseCache(openid);
            if (caseInformation != null) {
                caseInformation.setAlarmPeopleBackPhoto(fileName);
                caseCache.setCaseCache(caseInformation);
                String imageBase64 = Base64Util.getImageBase64(file);
                //缓存图片的Base64编码
                photoCache.setPhotoCache(alarm, openid, back, imageBase64);
                logger.info("证件照国徽一面上传：结束" + fileName);
                return ajaxSucc("", "上传成功");
            } else {
                return ajaxFail("请求超时");
            }

        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("上传失败,请重新上传");
        }
    }

    /**
     * 报警人身份证正面上传
     *
     * @param file   身份证正面照片
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/idCardFrontUpload")
    public BaseResponse idCardFrontUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
        logger.info("我要报警openid:" + openid);
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            //文件名
            String fileName = file.getOriginalFilename();
            //向缓存中添加抓拍照的照片信息
            CaseInformation caseInformation = caseCache.getCaseCache(openid);
            if (caseInformation != null) {
                caseInformation.setAlarmPeopleFrontPhoto(fileName);
                caseCache.setCaseCache(caseInformation);
                String frontBase64 = Base64Util.getImageBase64(file);
                //缓存图片的Base64编码
                photoCache.setPhotoCache(alarm, openid, front, frontBase64);
                //人脸比对
                String photoBase64 = photoCache.getPhotoCache(alarm, openid, photo);
                Integer compareCode = SaiFuTeUtil.faceComparison(compareUrl, compare2Key, compare2Secret, frontBase64, photoBase64);
                if (compareCode != 0) {
                    return ajaxFail("系统判定不是同一人");
                }
                return ajaxSucc("", "系统判定是同一人");
            } else {
                return ajaxFail("请求超时");
            }
        } catch (Exception e) {
            return ajaxFail("人脸对比失败");
        }
    }

    /**
     * 报警人ocr识别接口
     *
     * @param openid openid
     * @return ocr识别结果
     */
    @GetMapping(value = "/alarmOcrDiscern")
    public BaseResponse alarmOcrDiscern(@RequestParam String openid) {
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            String frontBase64 = photoCache.getPhotoCache(alarm, openid, front);
            Map<String, String> map = SaiFuTeUtil.ocrDiscern(ocrUrl, Base64Util.generateImageByte(frontBase64));
            return ajaxSucc(map, "orc识别完成");
        } catch (Exception e) {
            return ajaxFail("识别失败");
        }
    }

    /**
     * 添加案件信息
     *
     * @return 添加结果
     */
    @PostMapping(value = "/addCaseInfo")
    public BaseResponse addCaseInfo(@RequestBody CaseInformation caseInfo) {
        try {
            if (StringUtils.isEmpty(caseInfo.getAlarmPeopleOpenid())) {
                return ajaxFail("报警人openid为空");
            }
            if (StringUtils.isEmpty(caseInfo.getAlarmPeopleName())) {
                return ajaxFail("报警人姓名为空");
            }
            if (StringUtils.isEmpty(caseInfo.getAlarmPeopleIdCard())) {
                return ajaxFail("报警人身份证号为空");
            }
            if (caseInfo.getAlarmPeopleIdCard().length() != idCardLength) {
                return ajaxFail("身份证不正确");
            }
            if (StringUtils.isEmpty(caseInfo.getAlarmPeoplePhone())) {
                return ajaxFail("报警人手机号为空");
            }
            if (caseInfo.getAlarmPeoplePhone().length() != phoneLength) {
                return ajaxFail("报警人手机号格式不对");
            }
            if (caseInfo.getAlarmType() == null) {
                return ajaxFail("报警事由为空");
            }
            if (StringUtils.isEmpty(caseInfo.getOwnerName())) {
                return ajaxFail("受害人姓名为空");
            }
            if (StringUtils.isEmpty(caseInfo.getOwnerCardId())) {
                return ajaxFail("受害人身份证号为空");
            }
            if (caseInfo.getOwnerCardId().length() != idCardLength) {
                return ajaxFail("身份证号不正确");
            }
            if (StringUtils.isEmpty(caseInfo.getFindCaseTime().toString())) {
                return ajaxFail("发案时间为空");
            }
            if (StringUtils.isEmpty(caseInfo.getFindCasePlace())) {
                return ajaxFail("发案地点为空");
            }
            if (StringUtils.isEmpty(caseInfo.getFindCaseLongitude())) {
                return ajaxFail("发案地点经度为空");
            }
            if (StringUtils.isEmpty(caseInfo.getFindCaseLatitude())) {
                return ajaxFail("发案地点纬度为空");
            }
            if (StringUtils.isEmpty(caseInfo.getAlarmPass())) {
                return ajaxFail("报警地点为空");
            }
            if (StringUtils.isEmpty(caseInfo.getAlarmLongitude())) {
                return ajaxFail("报警地点经度为空");
            }
            if (StringUtils.isEmpty(caseInfo.getAlarmLatitude())) {
                return ajaxFail("报警地点纬度为空");
            }
            if (StringUtils.isEmpty(caseInfo.getLostPhoneNumber())) {
                return ajaxFail("丢失手机号为空");
            }
            if (caseInfo.getLostPhoneNumber().length() != phoneLength) {
                return ajaxFail("丢失手机号格式不对");
            }
            if (StringUtils.isEmpty(caseInfo.getLostPhoneBrand())) {
                return ajaxFail("丢失手机品牌为空");
            }
            if (StringUtils.isEmpty(caseInfo.getLostPhonePurchasingDate())) {
                return ajaxFail("购买时间为空");
            }
            if (StringUtils.isEmpty(caseInfo.getContactNumber())) {
                return ajaxFail("报警人联系电话为空");
            }
            if (caseInfo.getContactNumber().length() != phoneLength) {
                return ajaxFail("报警人联系电话格式不对");
            }
            caseInfo.setAlarmStatus(1);
            CaseInformation caseInformation = caseCache.getCaseCache(caseInfo.getAlarmPeopleOpenid());
            if (caseInformation != null) {
                caseInfo.setAlarmPeopleBackPhoto(caseInformation.getAlarmPeopleBackPhoto());
                caseInfo.setAlarmPeopleFrontPhoto(caseInformation.getAlarmPeopleFrontPhoto());
                caseInfo.setAlarmPeoplePhoto(caseInformation.getAlarmPeoplePhoto());
                //存mysql数据库
                caseInformationService.save(caseInfo);
                Integer id = caseInformation.getId();
                //在中间表 case_relation 中插入一条记录
                CaseRelation caseRelation = new CaseRelation();
                caseRelation.setAlarmId(id);
                caseRelation.setOpenid(caseInfo.getAlarmPeopleOpenid());
                caseRelationService.save(caseRelation);
                //======================在ftp服务器上生成相应的图片==================================
                //获取抓拍图片，缓存的Base64编码
                String photoBase64 = photoCache.getPhotoCache(alarm, caseInfo.getAlarmPeopleOpenid(), photo);
                if (StringUtils.isEmpty(photoBase64)) {
                    return ajaxFail("请求超时");
                }
                //获取国徽一面，缓存的Base64编码
                String backBase64 = photoCache.getPhotoCache(alarm, caseInfo.getAlarmPeopleOpenid(), back);
                if (StringUtils.isEmpty(backBase64)) {
                    return ajaxFail("请求超时");
                }
                //获取人脸一面，缓存的Base64编码
                String frontBase64 = photoCache.getPhotoCache(alarm, caseInfo.getAlarmPeopleOpenid(), front);
                if (StringUtils.isEmpty(frontBase64)) {
                    return ajaxFail("请求超时");
                }
                // 清除缓存
                caseCache.delCaseCache(caseInfo.getAlarmPeopleOpenid());
                photoCache.delPhotoCache(alarm, caseInfo.getAlarmPeopleOpenid(), photo);
                photoCache.delPhotoCache(alarm, caseInfo.getAlarmPeopleOpenid(), back);
                photoCache.delPhotoCache(alarm, caseInfo.getAlarmPeopleOpenid(), front);

                logger.info(caseInfo.getAlarmPeopleOpenid() + "提交报警成功");
                return ajaxSucc("", "保存成功");
            } else {
                return ajaxFail("请求超时");
            }
        } catch (Exception e) {
            logger.error(caseInfo.getAlarmPeopleOpenid() + "提交报警失败", e);
            return ajaxFail("保存失败");
        }

    }

    /**
     * 查询我的报警
     *
     * @param openid openid
     * @return 结果
     */
    @GetMapping(value = "/queryAlarmList")
    public BaseResponse queryAlarmList(@RequestParam String openid) {
        try {
            logger.info("我的报警openid:" + openid);
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }

            CaseRelationExample caseRelationExample = new CaseRelationExample();
            caseRelationExample.createCriteria().andOpenidEqualTo(openid);
            List<CaseRelation> caseRelationList = caseRelationService.selectAll(caseRelationExample);
            List<Integer> alarmIds = new ArrayList<>();
            if (caseRelationList != null && caseRelationList.size() > 0) {
                for (CaseRelation caseRelation : caseRelationList) {
                    alarmIds.add(caseRelation.getAlarmId());
                }
            }
            if (alarmIds.size() > 0) {
                CaseInformationExample caseInformationExample = new CaseInformationExample();
                caseInformationExample.setOrderByClause("alarmTime desc");
                caseInformationExample.createCriteria().andIdIn(alarmIds);
                List<CaseInformation> caseInformationList = caseInformationService.selectAll(caseInformationExample);
                return ajaxSucc(caseInformationList, "查询成功");
            } else {
                return ajaxSucc("", "查询成功");
            }
        } catch (Exception e) {
            logger.error("查询失败：" + e);
            return ajaxFail("查询失败");
        }
    }


    /**
     * 通过案件id去刑专查询案件的详情
     *
     * @param alarmId 案件id
     * @return 返回结果
     */
    @GetMapping(value = "/queryAlarmById")
    public BaseResponse queryAlarmById(@RequestParam String alarmId) {
        try {
            logger.info("案件id:" + alarmId);
            if (StringUtils.isEmpty(alarmId)) {
                return ajaxFail("案件id为空");
            }
			// JSONObject data = new JSONObject();
            // data.put("bjwybz", alarm_id);
            // data.put("fwid", "ajcx");
            // String result = CommonUtil.uploadXingZhuan(XINGZHUAN_URL, data.toString());
            // logger.info("刑专的返回结果：" + result);
            // JSONObject parseObject = JSONObject.parseObject(result);
            // Object obj = parseObject.get("data");
            // logger.info("obj:"+obj);
            // String str = null;
            // if(obj != null && !"".equals(obj)) {
            // 	str = (String)parseObject.get("data");
            // 	JSONArray array = JSONArray.parseArray(str);
            // 	Object object = array.get(0);
            // 	parseObject.put("data", object);
            // }
            return ajaxSucc("", "查询成功");
        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("查询失败");
        }
    }
}
