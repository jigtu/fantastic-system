package com.anti.theft.handler;

import com.anti.common.entity.BaseResponse;
import com.anti.common.util.Base64Util;
import com.anti.common.util.SaiFuTeUtil;
import com.anti.theft.cache.BlackListLogCache;
import com.anti.theft.entity.BlackList;
import com.anti.theft.entity.BlackListExample;
import com.anti.theft.entity.BlackListLog;
import com.anti.theft.service.BlackListLogService;
import com.anti.theft.service.BlackListService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


/**
 * 黑名单controller)
 *
 * @author ZiQiang
 */
@RestController
@RequestMapping("/api/blacklist")
public class BlackListController extends BaseHandler {
    private static Logger logger = LoggerFactory.getLogger(BlackListController.class);

    @Resource
    private BlackListLogService blackListLogService;

    @Resource
    private BlackListService blackListService;

    @Resource
    private BlackListLogCache logCache;


    /**
     * 查询是否是涉嫌手机
     *
     * @param openid    查询人openid
     * @param imei      查询手机imei
     * @param address   查询地址
     * @param longitude 查询地址经度
     * @param latitude  查询地址纬度
     * @return 查询结果
     */
    @PostMapping(value = "/available")
    public BaseResponse getIsAvailable(@RequestParam String openid,
                                       @RequestParam String imei,
                                       @RequestParam String address,
                                       @RequestParam String longitude,
                                       @RequestParam String latitude) {
        logger.info("黑名单查询--:" + openid);
        try {
            if (StringUtils.isEmpty(openid)) {
                return ajaxFail("查询人openid不能为空");
            }
            if (StringUtils.isEmpty(imei)) {
                return ajaxFail("查询imei号码不能为空");
            }
            if (!imei.matches(reg)) {
                return ajaxFail("imei号必须为纯数字");
            }
            if (imei.length() > imeiMaxLength || imei.length() < imeiMinLength) {
                return ajaxFail("imei号的长度在15-17之间");
            }
            if (StringUtils.isEmpty(address)) {
                return ajaxFail("查询地点不能为空");
            }
            if (StringUtils.isEmpty(longitude)) {
                return ajaxFail("查询地点经度不能为空");
            }
            if (StringUtils.isEmpty(latitude)) {
                return ajaxFail("查询地点纬度不能为空");
            }
            // 记录查询日志需要的数据 从缓存获取部分数据
            BlackListLog blackListLog = logCache.getBlackListLogCache(openid);
            if (blackListLog == null) {
                blackListLog = new BlackListLog();
            }
            blackListLog.setOpenid(openid);
            blackListLog.setImei(imei);
            blackListLog.setQueryAddress(address);
            blackListLog.setLongitude(longitude);
            blackListLog.setLatitude(latitude);
            blackListLog.setQueryTime(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));

            // 查询是否是涉嫌手机
            BlackListExample blackListExample = new BlackListExample();
            BlackListExample.Criteria criteria = blackListExample.createCriteria();
            criteria.andImeiEqualTo(imei);
            List<BlackList> blackList = blackListService.selectAll(blackListExample);
            // 构造邢专接口需要的参数数据
            // 查询结论
            int result = 0;
            // 如果库中不存在 不是
            if (null == blackList) {
                blackListLog.setQueryResult(0);
            }// 库中存在
            if (blackList != null) {
                // 为0 不涉嫌盗抢
                if (blackList.get(0).getStatus() == 0) {
                    blackListLog.setQueryResult(0);
                } else { // 否则涉嫌盗抢
                    blackListLog.setQueryResult(1);
                    result = 1;
                }
            }
            // 保存查询日志
            blackListLogService.save(blackListLog);
            // 获取查询唯一标识
            if (result == 0) {
                logger.info("openid:" + openid + "，查询结果：此设备不是涉事手机");
                return ajaxSucc(null, "此设备目前无嫌疑");
            } else {
                logger.info("openid:" + openid + "，查询结果：此设备是涉事手机");
                return ajaxSucc(null, "此设备目前涉嫌被盗、被抢、被骗");
            }
        } catch (Exception e) {
            logger.error("openid:" + openid + "，查询失败：" + e);
            return ajaxFail("查询失败");
        }
    }

    @PostMapping(value = "/ocr")
    public BaseResponse distinguishImei(@RequestParam MultipartFile file, @RequestParam String openId) {
        try {
            String imageBase64 = Base64Util.getImageBase64(file);
            Base64Util.generateImageByte(imageBase64);
            System.out.println("imei识别地址：" + imeiUrl);
            String result = SaiFuTeUtil.imeiDiscern(imeiUrl, Base64Util.generateImageByte(imageBase64));
            if (StringUtils.isEmpty(result)) {
                logger.error("openid:" + openId + "，识别失败");
                return ajaxFail("识别失败，请稍后重试");
            } else {
                return ajaxSucc(result, "识别成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("openid:" + openId + "，识别失败：" + e);
            return ajaxFail("识别失败，请稍后重试");
        }
    }
}
