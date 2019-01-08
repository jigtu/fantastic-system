package com.anti.theft.handler;

import com.alibaba.fastjson.JSON;
import com.anti.common.entity.BaseResponse;
import com.anti.theft.cache.BlackListCache;
import com.anti.theft.entity.BlackList;
import com.anti.theft.entity.BlackListExample;
import com.anti.theft.service.BlackListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ZiQiang
 * <p>
 * 描述：黑名单拉取api
 * 时间：2018-06-21 10:30:30
 */
@RestController
@RequestMapping(value = "/api/blacklist")
public class BlackListPushController extends BaseHandler {
    private static Logger logger = LoggerFactory.getLogger(BlackListPushController.class);

    @Resource
    private BlackListCache blackListCache;

    @Resource
    private BlackListService blackListService;

    @PostMapping(value = "/push")
    @SuppressWarnings("unchecked")
    public BaseResponse blackListPull(@RequestParam String params) {
        try {
            // 解析发送来的数据
            Map<String, String> map = (Map) JSON.parse(params);
            logger.info("推送的黑名单数据：" + map);
            // 从缓存中获取所有的黑名单
            Map<String, String> values = blackListCache.getValues();
            //将拉取的数据添加到redis存在的key 会覆盖原先的值
            List<BlackList> exist = new ArrayList<>();
            List<BlackList> unExist = new ArrayList<>();
            //redis 中是空的
            if (values.isEmpty()) {
                for (String key : map.keySet()) {
                    String value = map.get(key);
                    BlackList blackList = new BlackList();
                    blackList.setStatus(Integer.parseInt(value));
                    blackList.setAddTime(new Date());
                    // 不存在
                    blackList.setImei(key + "");
                    unExist.add(blackList);
                }
            } else {
                // 对比redis 中是否存在
                for (String key : map.keySet()) {
                    String value = map.get(key);
                    BlackList blackList = new BlackList();
                    blackList.setStatus(Integer.parseInt(value));
                    blackList.setAddTime(new Date());
                    if (values.get(key) == null) {
                        // redis 不存在
                        blackList.setImei(key);
                        unExist.add(blackList);
                    } else {
                        // redis中存在
                        blackList.setImei(key);
                        exist.add(blackList);
                    }
                }
            }
            // 批量更新
            if (!exist.isEmpty()) {
                BlackListExample blackListExample = new BlackListExample();
                for (BlackList blackList : exist) {
                    blackListExample.createCriteria().andImeiEqualTo(blackList.getImei());
                    blackListService.update(blackList, blackListExample);
                }
            }
            // 批量保存
            if (!unExist.isEmpty()) {
                for (BlackList blackList : unExist) {
                    blackListService.save(blackList);
                }
            }
            // 更新redis
            blackListCache.addValues(map);
            logger.info("黑名单拉取成功");
            return ajaxSucc(null, "黑名单推送成功");
        } catch (Exception e) {
            logger.error("异常信息：" + e.getMessage());
            return ajaxFail("黑名单推送发生异常：" + e.getMessage());
        }
    }
}
