package com.anti.theft.cache;


import com.anti.common.util.SerializeUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * @author ZiQiang
 */
public class BaseCache {

    byte[] serialize(Object object) {
        return SerializeUtil.serialize(object);
    }

    Object deserialize(byte[] bytes) {
        return SerializeUtil.unSerialize(bytes);
    }

    /**
     * 获取资源
     *
     * @return Jedis
     */
    public Jedis getResource(JedisPool jedisPool) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
        } catch (Exception e) {
            if (jedis != null) {
                jedis.close();
            }
            throw e;
        }
        return jedis;
    }
}