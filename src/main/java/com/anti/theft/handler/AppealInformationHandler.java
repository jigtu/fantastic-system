package com.anti.theft.handler;

import com.alibaba.fastjson.JSONObject;
import com.anti.common.entity.BaseResponse;
import com.anti.common.ljy.FaceRecognition;
import com.anti.common.util.Base64Util;
import com.anti.common.util.SaiFuTeUtil;
import com.anti.theft.cache.AppealCache;
import com.anti.theft.cache.PhotoCache;
import com.anti.theft.entity.AppealInformation;
import com.anti.theft.entity.AppealInformationExample;
import com.anti.theft.service.AppealInformationService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZiQiang
 */
@RestController
@RequestMapping(value = "/api/appeal")
public class AppealInformationHandler extends BaseHandler {

    private static Logger logger = LoggerFactory.getLogger(AppealInformationHandler.class);

    @Resource
    private
    AppealInformationService appealInformationService;

    @Resource
    private PhotoCache photoCache;

    @Resource
    private AppealCache appealCache;

    /**
     * 申诉人假体检测接口
     *
     * @param file   视频
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/appealPeopleUpload")
    public BaseResponse livingUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
        logger.info("申诉活体--:" + openid);
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("申诉人openid为空");
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
                String filePath = uploadPath + File.separator + openid + File.separator + appeal + File.separator + Clock.systemUTC().millis();
                File appUserFile = new File(filePath);
                logger.info("视频目录" + filePath);
                if (!appUserFile.exists()) {
                    boolean mkdirs = appUserFile.mkdirs();
                }
                // 文件存储路径
                filePath = filePath + File.separator + fileName;
                // 转存文件
                file.transferTo(new File(filePath));
                logger.info("假体检测地址：" + prosthesisUrl);
                if (StringUtils.isEmpty(prosthesisSecret) || "".equals(prosthesisSecret)) {
                    prosthesisSecret = "";
                }
                //假体检测
                String result = FaceRecognition.prosthesisCheck(prosthesisUrl, filePath, prosthesisKey, prosthesisSecret);
                JSONObject parseObject = JSONObject.parseObject(result);
                logger.info("假体检测结果：" + parseObject.get("info"));
                Integer code = (Integer) parseObject.get("code");
                if (code != 0) {
                    return ajaxFail(parseObject.get("info"));
                }
                //项目目录生成抓拍照片
                JSONObject jsonObject = parseObject.getJSONObject("data");
                imageBase64 = (String) jsonObject.get(photo);
                fileName = fileName.substring(0, fileName.lastIndexOf(".")) + ".jpg";
                //操作完成，删除视频
                boolean delete = new File(filePath).delete();
                logger.info("删除临时视频：" + delete);
            } else {//上传的是图片直接转换成Base64编码存入缓存中
                imageBase64 = Base64Util.getImageBase64(file);
            }
            //在本地生成图片
            String photoPath = uploadPath + File.separator + appeal + File.separator + Clock.systemUTC().millis() + (int) ((Math.random() * 9 + 1) * 100);
            logger.info("图片目录" + photoPath);
            if (!new File(photoPath).exists()) {
                boolean mkdirs = new File(photoPath).mkdirs();
            }
            Base64Util.generateImage(imageBase64, photoPath + File.separator + fileName);
            //向缓存中添加抓拍照的照片信息
            AppealInformation appealInformation = new AppealInformation();
            appealInformation.setOpenid(openid);
            appealInformation.setPhoto(fileName);
            appealCache.setAppealCache(appealInformation);
            //缓存图片的Base64编码
            photoCache.setPhotoCache(appeal, openid, photo, imageBase64);
            Map<String, Object> map = new HashMap<>(1);
            map.put("photoPath", photoPath + File.separator + fileName);
            logger.info("申诉人:" + openid + ",上传视频成功");
            return ajaxSucc(map, "上传成功");
        } catch (Exception e) {
            logger.error("申诉人:" + openid + ",上传视频失败  " + e);
            return ajaxFail("上传失败");
        }
    }

    /**
     * 申诉人身份证拍照国徽上传
     *
     * @param file   身份证照片
     * @param openid openid
     * @return 解果
     */
    @PostMapping(value = "/idCardBackUpload")
    public BaseResponse idCardBackUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
        logger.info("申诉国徽--:" + openid);
        try {
            System.out.println("证件照国徽一面上传：开始");
            //=======================效验必传参数============================
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("申诉人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            //===========================结束==============================
            //文件名
            String fileName = file.getOriginalFilename();
            //向缓存中添加抓拍照的照片信息
            AppealInformation appealInformation = appealCache.getAppealCache(openid);
            appealInformation.setBackPhoto(fileName);
            appealCache.setAppealCache(appealInformation);

            String imageBase64 = Base64Util.getImageBase64(file);
            //缓存图片的Base64编码
            photoCache.setPhotoCache(appeal, openid, back, imageBase64);
            logger.info("申诉人:" + openid + ",上传国徽照成功:" + fileName);
            return ajaxSucc("", "上传成功");
        } catch (Exception e) {
            logger.error("申诉人:" + openid + ",上传国徽照失败  " + e);
            e.printStackTrace();
            return ajaxFail("上传失败,请重新上传");
        }
    }

    /**
     * 申诉人身份证拍照人脸上传对比
     *
     * @param file   身份证照片
     * @param openid openid
     * @return 结果
     */
    @PostMapping(value = "/idCardFrontUpload")
    public BaseResponse idCardFrontUpload(@RequestParam MultipartFile file, @RequestParam String openid) {
        System.out.println("申诉人脸--:" + openid);

        try {
            System.out.println("证件照人脸一面上传：开始");
            //=======================效验必传参数============================
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("申诉人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }
            if (file.getSize() > size) {
                return ajaxFail("超出上传文件大小(最大限度15M)，请重新设置手机拍照参数");
            }
            //===========================结束==============================
            //文件名
            String fileName = file.getOriginalFilename();
            //向缓存中添加抓拍照的照片信息
            AppealInformation appealInformation = appealCache.getAppealCache(openid);
            appealInformation.setFrontPhoto(fileName);
            appealCache.setAppealCache(appealInformation);

            String frontBase64 = Base64Util.getImageBase64(file);
            //缓存图片的Base64编码
            photoCache.setPhotoCache(appeal, openid, front, frontBase64);

            //获取抓拍图片，缓存的Base64编码
            String photoBase64 = photoCache.getPhotoCache(appeal, openid, photo);
            //获取国徽一面，缓存的Base64编码
            // String backBase64 = photoCache.getPhotoCache(appeal, openid, back)
            System.out.println("证件照人脸一面上传：结束" + fileName);
            // 进行人脸对比
            Integer comparaCode = SaiFuTeUtil.faceComparison(compareUrl, compare2Key, "", frontBase64, photoBase64);
            // 人脸对比未通过
            if (comparaCode != 0) {
                System.out.println("=============人脸比对未通过=======================");
                return ajaxFail("系统判定不是同一人");
            }
            // 人脸对比通过
            logger.info("申诉人:" + openid + ",上传证件照成功，人脸对比成功");
            return ajaxSucc("", "系统判定是同一人");
        } catch (Exception e) {
            logger.error("申诉人:" + openid + ",上传人脸照失败  " + e);
            e.printStackTrace();
            return ajaxFail("证件上传失败,请重新上传");
        }
    }


    /**
     * @param openid          申诉人openid
     * @param name            申诉人姓名
     * @param idCard          申诉人身份证号
     * @param contactNumber   申诉人电话
     * @param appealAddr      申诉地址
     * @param appealUsualAddr 申诉人常住地
     * @param buyingAddr      购买地点
     * @param appealLongitude 申诉地点经度
     * @param appealLatitude  申诉地点纬度
     */
    @PostMapping("/submissionAppealInformation")
    public BaseResponse saveAppealInfo(@RequestParam String openid,@RequestParam String name,@RequestParam String idCard,@RequestParam String contactNumber,
                                       @RequestParam String appealAddr,@RequestParam String appealUsualAddr,@RequestParam String buyingAddr,
                                       @RequestParam String appealLongitude,@RequestParam String appealLatitude,@RequestParam String appealCause,
                                       @RequestParam(required = false) String cellphoneFeatures,@RequestParam(required = false) String buyingTime,@RequestParam(required = false) String imei,@RequestParam(required = false) MultipartFile file) {
        logger.info("申诉提交--:" + openid);
        try {
            // 校验数据
            //=======================效验必传参数============================
            if (StringUtils.isEmpty(appealCause)) {
                return ajaxFail("申诉原因不能为空");
            }
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("openid不能为空");
            }
            if (StringUtils.isEmpty(name)) {
                return ajaxFail("姓名不能为空");
            }
            if (StringUtils.isEmpty(idCard)) {
                return ajaxFail("身份证号不能为空");
            }
            if (idCard.length() != idCardLength) {
                return ajaxFail("身份证号不正确");
            }
            if (StringUtils.isEmpty(contactNumber)) {
                return ajaxFail("联系电话不能为空");
            }
            if (StringUtils.isEmpty(appealAddr)) {
                return ajaxFail("申诉地点不能为空");
            }
            if (StringUtils.isEmpty(appealUsualAddr)) {
                return ajaxFail("常住地不能为空");
            }
            if (StringUtils.isEmpty(buyingAddr)) {
                return ajaxFail("手机购买地点不能为空");
            }
            if (StringUtils.isEmpty(appealLongitude)) {
                return ajaxFail("神速地点经度不能为空");
            }
            if (StringUtils.isEmpty(appealLatitude)) {
                return ajaxFail("申诉地点纬度不能为空");
            }
            if (StringUtils.isEmpty(imei)) {
                return ajaxFail("手机串号不能为空");
            }
            if (!imei.matches(reg)) {
                return ajaxFail("手机串号必须为纯数字");
            }
            int len = 17, lg = 15;
            if (imei.length() > len || imei.length() < lg) {
                return ajaxFail("手机串号的长度在15-17之间");
            }
            AppealInformation appealInformation = appealCache.getAppealCache(openid);
            appealInformation.setName(name);
            appealInformation.setIdCard(idCard);
            appealInformation.setContactNumber(contactNumber);
            // 添加申诉人常住地、申诉时间、手机购买地点、经/纬度
            appealInformation.setAppealAddr(appealAddr);
            appealInformation.setAppealUsualAddr(appealUsualAddr);
            appealInformation.setBuyingAddr(buyingAddr);
            appealInformation.setAppealLongitude(appealLongitude);
            appealInformation.setAppealLatitude(appealLatitude);
            // 申诉时间 系统获取
            appealInformation.setComplainTime(new Date());
            //保存证据图片
            String evidenceBase64 = null;
            String fileName;
            if (!file.isEmpty()) {
                fileName = file.getOriginalFilename();
                appealInformation.setEcidence(fileName);
                evidenceBase64 = Base64Util.getImageBase64(file);
            }
            // 赋值
            appealInformation.setAppealCause(StringUtils.isNotEmpty(appealCause) ? appealCause : "");
            appealInformation.setCellPhoneFeatures(StringUtils.isNotEmpty(cellphoneFeatures) ? cellphoneFeatures : "");
            appealInformation.setImei(StringUtils.isNotEmpty(imei) ? imei : "");
            LocalDateTime localDateTime = LocalDateTime.parse(buyingTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
            appealInformation.setBuyingTime(StringUtils.isNotEmpty(buyingTime) ? Date.from(instant) : null);
            appealInformation.setAppealTime(new Date());
            appealInformation.setAppealState("1");
            appealInformationService.save(appealInformation);
            //获取抓拍图片，缓存的Base64编码 进行保存
            photoCache.getPhotoCache(appeal, openid, photo);
            //获取国徽一面，缓存的Base64编码
            photoCache.getPhotoCache(appeal, openid, back);
            //获取人脸一面，缓存的Base64编码
            photoCache.getPhotoCache(appeal, openid, front);
            //存储证据图片
            StringUtils.isNotEmpty(evidenceBase64);
            appealCache.setAppealCache(appealInformation);
            logger.info("申诉人:" + openid + ",提交申诉信息成功");
            return ajaxSucc("", "申诉成功");
        } catch (Exception e) {
            logger.error("申诉人:" + openid + ",提交申诉信息失败  " + e);
            return ajaxFail("申诉失败,请稍后重新申诉");
        }
    }

    /**
     * 上传证据接口
     *
     * @param openid openid
     * @param file   证据图片
     * @return 返回结果
     */
    @PostMapping(value = "/setImageBase64Ecidence")
    public BaseResponse setImageBase64Ecidence(@RequestParam String openid, @RequestParam MultipartFile file) {
        logger.info("申诉证据上传-openid:" + openid);
        try {
            logger.info("证据上传：开始");
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("申诉人openid为空");
            }
            if (file.isEmpty()) {
                return ajaxFail("上传失败");
            }

            AppealInformation appealInformation = appealCache.getAppealCache(openid);
            String fileName = file.getOriginalFilename();
            if (StringUtils.isEmpty(appealInformation.getEcidence())) {
                appealInformation.setEcidence(fileName);
            } else {
                appealInformation.setEcidence(appealInformation.getEcidence() + "," + fileName);
            }
            //Base64Util.getImageBase64(file)
            AppealInformation appealInfo = new AppealInformation();
            appealInfo.setId(appealInformation.getId());
            appealInfo.setEcidence(appealInformation.getEcidence());
            appealInformationService.updateById(appealInfo);
            logger.info("申诉人:" + openid + ",上传证据成功");
            return ajaxSucc("", "添加成功");
        } catch (Exception e) {
            logger.error("申诉人:" + openid + ",上传证据失败");
            return ajaxFail("添加失败");
        }
    }

    /**
     * 查询申诉列表
     *
     * @param openid openid
     * @return 结果
     */
    @GetMapping(value = "/queryAppealList")
    public BaseResponse queryAppealList(@RequestParam String openid) {
        logger.info("申诉查询-openid:" + openid);
        try {
            System.out.println("我的申诉openid:" + openid);
            AppealInformationExample example = new AppealInformationExample();
            example.setOrderByClause("`appealTime` DESC");
            AppealInformationExample.Criteria criteria = example.createCriteria();
            criteria.andOpenidEqualTo(openid);
            List<AppealInformation> appealInformationList = appealInformationService.selectAll(example);
            logger.info("申诉人:" + openid + ",查询申诉信息成功");
            return ajaxSucc(appealInformationList, "查询成功");
        } catch (Exception e) {
            logger.error("申诉人:" + openid + ",查询申诉信息成功");
            e.printStackTrace();
            return ajaxFail("查询失败");
        }
    }

    /**
     * 申诉人ocr识别接口
     *
     * @param openid 申诉人openid
     * @return 识别结果
     */
    @GetMapping(value = "/appealOcrDiscern")
    public BaseResponse appealOcrDiscern(@RequestParam String openid) {
        logger.info("申诉ocr-openid:" + openid);
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("申诉人openid为空");
            }
            // 获取缓存的证件照信息
            // photoCache.getPhotoCache(appeal, openid, back)
            String frontBase64 = photoCache.getPhotoCache(appeal, openid, front);
            // ocr识别
            Map<String, String> map = SaiFuTeUtil.ocrDiscern(ocrUrl, Base64Util.generateImageByte(frontBase64));
            logger.info("ocr识别完成、、结果：" + map);
            logger.info("申诉人:" + openid + ",ocr识别成功");
            return ajaxSucc(map, "orc识别完成");
        } catch (Exception e) {
            logger.info("申诉人:" + openid + ",ocr识别失败  " + e);
            return ajaxFail("识别失败");
        }
    }
}
