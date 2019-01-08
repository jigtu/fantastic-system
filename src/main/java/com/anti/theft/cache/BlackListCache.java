package com.anti.theft.cache;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.Map;

import static com.anti.common.util.Constant.BLACK_LIST;
import static com.anti.common.util.Constant.BLACK_LIST_MAP;

/**
 * 缓存黑名单的信息
 *
 * @author ZiQiang
 */
@Component
public class BlackListCache extends BaseCache {

    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存黑名单信息
     *
     * @param json 缓存数据
     * @return 添加结果
     */
    public String setBlackListCache(String uuid, String json) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set((BLACK_LIST + uuid).getBytes(), serialize(json));
        jedis.expire((BLACK_LIST + uuid).getBytes(), 300);
        jedis.close();
        return result;
    }

    /**
     * 获取黑名单的缓存信息
     *
     * @param uuid 黑名单缓存key
     * @return 缓存数据
     */
    public String getBlackListCache(String uuid) {
        String json = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((BLACK_LIST + uuid).getBytes())) {
            json = (String) deserialize(jedis.get((BLACK_LIST + uuid).getBytes()));
        }
        jedis.close();
        return json;
    }

    /**
     * 删除黑名单缓存信息
     *
     * @param uuid uuid
     * @return 结果
     */
    public Long delBlacklistCache(String uuid) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((BLACK_LIST + uuid).getBytes())) {
            Long log = jedis.del((BLACK_LIST + uuid).getBytes());
            jedis.close();
            return log;
        } else {
            return null;
        }
    }

    /**
     * 往黑名单中添加数据
     *
     * @param values map
     */
    public void addValues(Map<String, String> values) {
        Jedis jedis = getResource(jedisPool);
        if (values == null || values.isEmpty()) {
            return;
        }
        jedis.hmset(BLACK_LIST_MAP, values);
        jedis.close();
    }

    /**
     * 添加单个imei 黑名单
     *
     * @param imei   imei
     * @param status 状态
     */
    public void addValue(String imei, String status) {
        Jedis jedis = getResource(jedisPool);
        if (imei == null || status == null) {
            return;
        }
        jedis.hset(BLACK_LIST_MAP, imei, status);
        jedis.close();
    }


    /**
     * 判断黑名单key是否存在
     *
     * @return 结果
     */
    public boolean exist() {
        Jedis jedis = getResource(jedisPool);
        Boolean exists = jedis.exists(BLACK_LIST_MAP);
        jedis.close();
        return exists;
    }

    /**
     * 判断指定imei的数据存在不存在
     *
     * @param imei imei
     * @return 存在或者不存在
     */
    public boolean exist(String imei) {
        Jedis jedis = getResource(jedisPool);
        if (imei == null) {
            return false;
        }
        Boolean exists = jedis.hexists(BLACK_LIST_MAP, imei);
        jedis.close();
        return exists;
    }

    /**
     * 删除指定key
     */
    public void delete() {
        Jedis jedis = getResource(jedisPool);
        jedis.del(BLACK_LIST_MAP);
        jedis.close();
    }

    /**
     * 删除指定imei
     *
     * @param imei imei
     */
    public void delete(String imei) {
        Jedis jedis = getResource(jedisPool);
        if (imei == null) {
            return;
        }
        jedis.hdel(BLACK_LIST_MAP, imei);
        jedis.close();
    }

    /**
     * 获取所有的黑名单
     *
     * @return 黑名单集合
     */
    public Map<String, String> getValues() {
        Jedis jedis = getResource(jedisPool);
        Map<String, String> map = jedis.hgetAll(BLACK_LIST_MAP);
        jedis.close();
        return map;
    }
}
