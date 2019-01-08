package com.anti.theft.handler;

import com.alibaba.fastjson.JSONObject;
import com.anti.common.entity.BaseResponse;
import com.anti.common.ljy.FaceRecognition;
import com.anti.common.util.Base64Util;
import com.anti.common.util.SaiFuTeUtil;
import com.anti.theft.cache.BackoutCache;
import com.anti.theft.cache.PhotoCache;
import com.anti.theft.entity.*;
import com.anti.theft.service.CaseBackoutService;
import com.anti.theft.service.CaseInformationService;
import com.anti.theft.service.CaseRelationService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.time.Clock;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author ZiQiang
 * 时间： 2018/7/14 12:25
 */
@RestController
@RequestMapping(value = "/api/revocation")
public class CaseRevocationHandler extends BaseHandler {
    private static Logger logger = LoggerFactory.getLogger(CaseRevocationHandler.class);

    @Resource
    private CaseInformationService caseInformationService;

    @Resource
    private PhotoCache photoCache;

    @Resource
    private CaseRelationService caseRelationService;

    @Resource
    private CaseBackoutService caseBackoutService;
    @Resource
    private BackoutCache backoutCache;

    /**
     * 撤销报警-动态验证接口
     *
     * @param file    视频
     * @param openid  openid
     * @param alarmId 报警id
     * @return 结果
     */
    @PostMapping(value = "/backoutPeopleUpload")
    public BaseResponse backoutPeopleUpload(@RequestParam MultipartFile file, @RequestParam String openid, @RequestParam String alarmId) {
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (StringUtils.isEmpty(alarmId)) {
                return ajaxFail("报警记录id为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }

            //创建目录,保存视频
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
                String filePath = uploadPath + File.separator + openid + File.separator + backout + File.separator + System.currentTimeMillis();
                File appUserFile = new File(filePath);
                logger.info("视频目录" + filePath);
                if (!appUserFile.exists()) {
                    boolean mkdirs = appUserFile.mkdirs();
                    logger.info("" + mkdirs);
                }
                //文件存储路径
                filePath = filePath + File.separator + fileName;
                //转存文件
                file.transferTo(new File(filePath));
                //假体检测
                String result = FaceRecognition.prosthesisCheck(prosthesisUrl, filePath, prosthesisKey, prosthesisSecret);
                JSONObject parseObject = JSONObject.parseObject(result);
                Integer code = (Integer) parseObject.get("code");
                System.out.println("假体检测结果：" + code);
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
                logger.info("" + delete);
            } else {//上传的是图片直接转换成Base64编码存入缓存中
                imageBase64 = Base64Util.getImageBase64(file);
            }

            //在本地生成图片
            String photoPath = uploadPath + File.separator + backout + File.separator + System.currentTimeMillis() + (int) ((Math.random() * 9 + 1) * 100);
            File appUserFile = new File(photoPath);
            logger.info("图片目录" + photoPath);
            if (!appUserFile.exists()) {
                boolean mkdirs = appUserFile.mkdirs();
                logger.info("" + mkdirs);
            }
            Base64Util.generateImage(imageBase64, photoPath + File.separator + fileName);

            //缓存撤销人的照片
            CaseBackout caseBackout = new CaseBackout();
            caseBackout.setCaseId(Integer.parseInt(alarmId));
            caseBackout.setOpenid(openid);
            caseBackout.setBackoutBackPhoto(fileName);
            backoutCache.setBackoutCache(caseBackout);

            //缓存图片的Base64编码
            photoCache.setPhotoCache(backout, openid, photo, imageBase64);
            Map<String, Object> map = new HashMap<>(1);
            map.put("photoPath", photoPath + File.separator + fileName);
            return ajaxSucc(map, "上传成功");
        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("上传失败");
        }
    }


    /**
     * 撤销报警-撤销人身份证拍照国徽上传
     *
     * @param file   国徽照照片
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/backoutBackUpload")
    public BaseResponse backoutBackUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
        try {
            System.out.println("证件照国徽一面上传：开始");
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            String imageBase64 = Base64Util.getImageBase64(file);

            CaseBackout caseBackout = backoutCache.getBackoutCache(openid);
            if (caseBackout != null) {
                caseBackout.setBackoutBackPhoto(file.getOriginalFilename());
                backoutCache.setBackoutCache(caseBackout);
                //缓存图片的Base64编码
                photoCache.setPhotoCache(backout, openid, back, imageBase64);
                System.out.println("证件照国徽一面上传：结束");
                return ajaxSucc("", "上传成功");
            } else {
                return ajaxFail("请求超时");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return ajaxFail("上传失败,请重新上传");
        }
    }

    /**
     * 撤销报警-撤销人身份证拍照人脸面上传
     *
     * @param file   正面照
     * @param openid openid
     * @return 上传结果
     */
    @PostMapping(value = "/backoutFrontUpload")
    public BaseResponse backoutFrontUpload(@RequestParam MultipartFile file, @RequestParam String openid) {

        try {
            logger.info("证件照人脸一面上传：开始");
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }

            CaseBackout caseBackout = backoutCache.getBackoutCache(openid);
            if (caseBackout != null) {
                caseBackout.setBackoutFrontPhoto(file.getOriginalFilename());
                backoutCache.setBackoutCache(caseBackout);

                String frontBase64 = Base64Util.getImageBase64(file);
                photoCache.setPhotoCache(backout, openid, front, frontBase64);

                //人脸比对
                String photoBase64 = photoCache.getPhotoCache(backout, openid, photo);
                Integer comparaCode = SaiFuTeUtil.faceComparison(compareUrl, compare2Key, compare2Secret, frontBase64, photoBase64);
                if (comparaCode != 0) {
                    return ajaxFail("系统判定不是同一人");
                }
                return ajaxSucc("", "系统判定是同一人");
            } else {
                return ajaxFail("请求超时");
            }

        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("上传失败,请重新上传");
        }
    }

    /**
     * 撤销人ocr识别
     *
     * @param openid openid
     * @return 结果
     */
    @GetMapping(value = "/backoutOcrDiscern")
    public BaseResponse backoutOcrDiscern(@RequestParam String openid) {
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            String frontBase64 = photoCache.getPhotoCache(backout, openid, front);
            Map<String, String> map = SaiFuTeUtil.ocrDiscern(ocrUrl, Base64Util.generateImageByte(frontBase64));
            logger.info("ocr识别完成:" + map);
            return ajaxSucc(map, "orc识别完成");
        } catch (Exception e) {
            logger.error("异常：" + e);
            return null;
        }
    }

    /**
     * 撤销报警-提交撤销报警信息
     *
     * @param caseBackout 案件报警信息
     * @return 撤销结果
     */
    @PostMapping(value = "/backoutPeopleInfo")
    public BaseResponse backoutPeopleInfo(@RequestBody CaseBackout caseBackout) {
        String openid = caseBackout.getOpenid();
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutName())) {
                return ajaxFail("撤销人姓名为空");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutIdCard())) {
                return ajaxFail("撤销人身份证号为空");
            }
            if (caseBackout.getBackoutIdCard().length() != idCardLength) {
                return ajaxFail("身份证不正确");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutPhone())) {
                return ajaxFail("撤销人手机号为空");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutReason())) {
                return ajaxFail("撤销报警原因为空");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutPlace())) {
                return ajaxFail("撤销报警地点为空");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutPlaceLongitude())) {
                return ajaxFail("撤销报警地点经度为空");
            }
            if (StringUtils.isEmpty(caseBackout.getBackoutPlaceLatitude())) {
                return ajaxFail("撤销报警地点纬度为空");
            }
            CaseBackout casebackout = backoutCache.getBackoutCache(openid);
            if (casebackout != null) {
                Integer caseId = casebackout.getCaseId();
                Date date = new Date();
                caseBackout.setBackoutTime(date);
                caseBackout.setBackoutFrontPhoto(casebackout.getBackoutFrontPhoto());
                caseBackout.setBackoutBackPhoto(casebackout.getBackoutBackPhoto());
                caseBackout.setBackoutPhoto(casebackout.getBackoutPhoto());
                caseBackout.setBackoutStatus("1");
                CaseInformation caseInformation = caseInformationService.selectById(caseId);
                String ownerName = caseInformation.getOwnerName();
                String ownerCardId = caseInformation.getOwnerCardId();
                caseInformation.setAlarmStatus(2);
                if (ownerName.equals(caseBackout.getBackoutName()) && ownerCardId.equals(caseBackout.getBackoutIdCard())) {
                    //======================在ftp服务器上生成相应的图片==================================
                    //获取抓拍图片，缓存的Base64编码
                    //photoCache.getPhotoCache(BACKOUT, openid, photo)
                    //获取国徽一面，缓存的Base64编码
                    //photoCache.getPhotoCache(BACKOUT, openid, back)
                    //获取人脸一面，缓存的Base64编
                    // photoCache.getPhotoCache(BACKOUT, openid, front)
                    //2.撤销人信息入mysql库
                    caseBackoutService.save(caseBackout);
                    //3.更改本地数据库的报警状态
                    caseInformationService.updateById(caseInformation);
                    //=========报警信息入库和在ftp服务器生成图片后，删除缓存中的key==================================
                    backoutCache.delBackoutCache(openid);
                    photoCache.delPhotoCache(backout, openid, photo);
                    photoCache.delPhotoCache(backout, openid, back);
                    photoCache.delPhotoCache(backout, openid, front);

                    logger.info(openid + "撤销报警成功");
                    return ajaxSucc("", "撤销成功");
                } else {
                    return ajaxFail("撤销失败，只有失主本人能进行撤销");
                }
            } else {
                return ajaxFail("请求超时");
            }

        } catch (Exception e) {
            logger.error(openid + "撤销报警失败:", e);
            return ajaxFail("撤销失败");
        }
    }

    /**
     * 提取报警信息-动态验证接口
     *
     * @param file   视频
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/extractPeopleUpload")
    public BaseResponse extractPeopleUpload(@RequestParam MultipartFile file, @RequestParam String openid) {

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
            //----------------------创建目录,保存视频--------------------------
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
                String filePath = uploadPath + File.separator + openid + File.separator + extract + File.separator + Clock.systemUTC().millis();
                File appUserFile = new File(filePath);
                System.out.println("视频目录" + filePath);
                if (!appUserFile.exists()) {
                    boolean mkdirs = appUserFile.mkdirs();
                    logger.info("创建文件夹:" + mkdirs);
                }
                //文件存储路径
                filePath = filePath + File.separator + fileName;
                //转存文件
                file.transferTo(new File(filePath));
                //假体检测
                String result = FaceRecognition.prosthesisCheck(prosthesisUrl, filePath, prosthesisKey, prosthesisSecret);
                JSONObject parseObject = JSONObject.parseObject(result);
                Integer code = (Integer) parseObject.get("code");
                System.out.println("假体检测结果：" + code);
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
            String photoPath = uploadPath + File.separator + extract + File.separator + Clock.systemUTC().millis() + (int) ((Math.random() * 9 + 1) * 100);
            File appUserFile = new File(photoPath);
            System.out.println("图片目录" + photoPath);
            if (!appUserFile.exists()) {
                boolean mkdirs = appUserFile.mkdirs();
                logger.info("创建文件夹:" + mkdirs);
            }
            Base64Util.generateImage(imageBase64, photoPath + File.separator + fileName);

            //缓存图片的Base64编码
            photoCache.setPhotoCache(extract, openid, photo, imageBase64);
            Map<String, Object> map = new HashMap<>(1);
            map.put("photoPath", photoPath + File.separator + fileName);
            return ajaxSucc(map, "上传成功");
        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("上传失败");
        }
    }


    /**
     * 提取-提取人身份证拍照国徽上传
     *
     * @param file   身份照国徽照片
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/extractBackUpload")
    public BaseResponse extractBackUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
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
            String imageBase64 = Base64Util.getImageBase64(file);
            //缓存图片的Base64编码
            photoCache.setPhotoCache(extract, openid, back, imageBase64);
            System.out.println("证件照国徽一面上传：结束");
            return ajaxSucc("", "上传成功");

        } catch (Exception e) {
            logger.info("异常：" + e);
            return ajaxFail("上传失败,请重新上传");
        }
    }

    /**
     * 提取-提取人身份证拍照人脸面上传
     *
     * @param file   证件照正面
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/extractFrontUpload")
    public BaseResponse extractFrontUpload(@RequestParam MultipartFile file, @RequestParam String openid) {

        try {
            logger.info("证件照人脸一面上传：开始");
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            String frontBase64 = Base64Util.getImageBase64(file);
            photoCache.setPhotoCache(extract, openid, front, frontBase64);

            //人脸比对
            String photoBase64 = photoCache.getPhotoCache(extract, openid, photo);
            Integer comparaCode = SaiFuTeUtil.faceComparison(compareUrl, compare2Key, compare2Secret, frontBase64, photoBase64);
            if (comparaCode != 0) {
                return ajaxFail("系统判定不是同一人");
            }
            return ajaxSucc("", "系统判定是同一人");

        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("上传失败,请重新上传");
        }
    }

    /**
     * 提取人ocr识别
     *
     * @param openid openid
     * @return 识别结果
     */
    @GetMapping(value = "/extractOcrDiscern")
    public BaseResponse extractOcrDiscern(@RequestParam String openid) {
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            String frontBase64 = photoCache.getPhotoCache(extract, openid, front);
            Map<String, String> map = SaiFuTeUtil.ocrDiscern(ocrUrl, Base64Util.generateImageByte(frontBase64));
            return ajaxSucc(map, "orc识别完成");
        } catch (Exception e) {
            logger.error("异常：" + e);
            return ajaxFail("识别异常");
        }
    }


    /**
     * 提取报警信息
     *
     * @param openid openid
     * @param name   姓名
     * @param idCard 身份证号码
     * @return 提取解果
     */
    @GetMapping(value = "/extractVerificationCode")
    public BaseResponse extractVerificationCode(@RequestParam String openid, @RequestParam String name, @RequestParam String idCard) {
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (StringUtils.isEmpty(name)) {
                return ajaxFail("提取人姓名为空");
            }
            if (StringUtils.isEmpty(idCard)) {
                return ajaxFail("提取人身份证号为空");
            }
            if (idCard.length() != idCardLength) {
                return ajaxFail("提取人身份证格式不对");
            }
            // 从邢专提取
            boolean flag = false;
            CaseInformationExample example = new CaseInformationExample();
            example.createCriteria().andAlarmPeopleIdCardEqualTo(idCard);
            List<CaseInformation> caseInformationList = caseInformationService.selectAll(example);
            if (caseInformationList.size() > 0) {
                for (CaseInformation caseInformation : caseInformationList) {
                    Integer id = caseInformation.getId();
                    System.out.println("id:" + id);
                    CaseRelationExample caseRelationExample = new CaseRelationExample();
                    CaseRelationExample.Criteria criteria = caseRelationExample.createCriteria();
                    criteria.andAlarmIdEqualTo(id);
                    criteria.andOpenidEqualTo(openid);
                    List<CaseRelation> caseRelations = caseRelationService.selectAll(caseRelationExample);
                    if (caseRelations == null || caseRelations.size() < 1) {
                        CaseRelation caseRelation = new CaseRelation();
                        caseRelation.setAlarmId(id);
                        caseRelation.setOpenid(openid);
                        caseRelationService.save(caseRelation);
                        flag = true;
                    }
                }
            }

            if (flag) {
                logger.info(openid + "提取报警信息成功");
                return ajaxSucc("", "提取成功");
            } else {
                return ajaxSucc("", "没有可提取的记录");
            }

        } catch (Exception e) {
            logger.error(openid + "提取报警信息失败", e);
            return ajaxFail("提取失败");
        }
    }

    /**
     * 补充报警信息
     *
     * @param caseInfo 案件信息
     * @return 补充解果
     */
    @PostMapping(value = "/updateCaseInformation")
    public BaseResponse updateCaseInformation(@RequestBody CaseInformation caseInfo) {
        String openid = caseInfo.getAlarmPeopleOpenid();
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("报警人openid为空");
            }
            if (StringUtils.isEmpty(caseInfo.getId() + "")) {
                return ajaxFail("案件id为空");
            }
            if (StringUtils.isEmpty(caseInfo.getLostPhoneNumber())) {
                return ajaxFail("丢失手机号为空");
            }
            if (StringUtils.isEmpty(caseInfo.getLostPhoneBrand())) {
                return ajaxFail("丢失手机型号为空");
            }
            if (StringUtils.isEmpty(caseInfo.getLostPhonePurchasingDate())) {
                return ajaxFail("丢失手机购机时间为空");
            }
            if (StringUtils.isEmpty(caseInfo.getContactNumber())) {
                return ajaxFail("失主联系电话为空");
            }
            CaseInformation caseInformation = new CaseInformation();
            caseInformation.setId((caseInfo.getId()));
            caseInformation.setUpdateTime(new Date());
            caseInformationService.updateById(caseInformation);
            logger.info(openid + "补充报警信息成功");
            return ajaxSucc("", "补充信息成功");
        } catch (Exception e) {
            logger.error(openid + "补充报警信息失败", e);
            return ajaxFail("补充信息失败");
        }
    }
}
