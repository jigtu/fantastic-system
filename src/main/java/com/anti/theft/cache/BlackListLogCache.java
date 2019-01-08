package com.anti.theft.cache;

import com.anti.theft.entity.BlackListLog;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

import static com.anti.common.util.Constant.BLACK_LIST_LOG;

/**
 * 缓存取查询日志的信息
 *
 * @author ZiQiang
 */
@Component
public class BlackListLogCache extends BaseCache {

    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存取查询日志信息
     *
     * @param blackListLog 缓存数据
     * @return 添加结果
     */
    public String setBlackListLogCache(BlackListLog blackListLog) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set((BLACK_LIST_LOG + blackListLog.getOpenid()).getBytes(), serialize(blackListLog));
        //设置key的有效时间为20分钟
        jedis.expire((BLACK_LIST_LOG + blackListLog.getOpenid()).getBytes(), 1200);
        jedis.close();
        return result;
    }

    /**
     * 获取查询日志的缓存信息
     *
     * @param openid openid
     * @return 缓存数据
     */
    public BlackListLog getBlackListLogCache(String openid) {
        BlackListLog json = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((BLACK_LIST_LOG + openid).getBytes())) {
            json = (BlackListLog) deserialize(jedis.get((BLACK_LIST_LOG + openid).getBytes()));
        }
        jedis.close();
        return json;
    }

    /**
     * 删除黑名单缓存信息
     *
     * @param openid
     * @return
     */
    public Long delBlackListLogCache(String openid) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((BLACK_LIST_LOG + openid).getBytes())) {
            Long log = jedis.del((BLACK_LIST_LOG + openid).getBytes());
            jedis.close();
            return log;
        } else {
            return 1L;
        }
    }
}
