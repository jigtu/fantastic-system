package com.anti.theft.cache;

import com.anti.common.util.Constant;
import com.anti.theft.entity.AppealInformation;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * 缓存申诉流程信息
 *
 * @author ZiQiang
 */
@Component
public class AppealCache extends BaseCache {
    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存申诉信息
     *
     * @param appealInformation 申诉信息
     * @return 保存结果
     */
    public String setAppealCache(AppealInformation appealInformation) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set((Constant.APPEAL + appealInformation.getOpenid()).getBytes(), serialize(appealInformation));
        //设置key的有效时间为20分钟
        jedis.expire((Constant.APPEAL + appealInformation.getOpenid()).getBytes(), Constant.TTL_IN_SEC);
        jedis.close();
        return result;
    }

    /**
     * 获取申诉信息
     *
     * @param openid openid
     * @return 申诉信息
     */
    public AppealInformation getAppealCache(String openid) {
        AppealInformation appealInformation = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((Constant.APPEAL + openid).getBytes())) {
            appealInformation = (AppealInformation) deserialize(jedis.get((Constant.APPEAL + openid).getBytes()));
        }
        jedis.close();
        return appealInformation;
    }

    /**
     * 删除缓存的申诉信息
     *
     * @param openid openid
     * @return 结果
     */
    public Long delAppealCache(String openid) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((Constant.APPEAL + openid).getBytes())) {
            Long log = jedis.del((Constant.APPEAL + openid).getBytes());
            jedis.close();
            return log;
        } else {
            return null;
        }
    }
}
