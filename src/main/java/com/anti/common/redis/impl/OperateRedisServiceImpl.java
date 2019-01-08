package com.anti.common.redis.impl;

import com.anti.common.redis.OperateRedisService;
import com.anti.common.util.SerializeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

/**
 * Redis工具使用
 *
 * @author ZiQiang
 */
@Service
public class OperateRedisServiceImpl implements OperateRedisService {

    private static Logger logger = LoggerFactory.getLogger(OperateRedisServiceImpl.class);

    @Resource
    private JedisPool jedisPool;

    @Override
    public <T> void addValue(String key, T mapValue) {
        Jedis jedis = jedis();
        jedis.set(key.getBytes(), SerializeUtil.serialize(mapValue));
        close(jedis);
        logger.info("添加成功--");
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getValue(String key, Class<T> t) {
        Jedis jedis = jedis();
        T serialize = (T) SerializeUtil.unSerialize(jedis.get(key.getBytes()));
        close(jedis);
        logger.info("获取成功--");
        return serialize;
    }

    @Override
    public void addValue(String key, String mapKey, String mapValue) {
        Jedis jedis = jedis();
        if (key == null || mapKey == null || mapValue == null) {
            return;
        }
        jedis.hset(key, mapKey, mapValue);
        logger.info("添加成功--");
        close(jedis);
    }

    @Override
    public void addValue(String key, String value) {
        Jedis jedis = jedis();
        if (key == null || value == null) {
            return;
        }
        jedis.set(key, value);
        close(jedis);
    }

    @Override
    public void addValue(String key, Integer seconds, String value) {
        Jedis jedis = jedis();
        if (key == null && value != null) {
            return;
        }
        jedis.setex(key, seconds, value);
        close(jedis);
        logger.info("添加成功");
    }

    @Override
    public void addValues(String key, Map<String, String> values) {
        Jedis jedis = jedis();
        if (key == null || values == null || values.isEmpty()) {
            return;
        }
        jedis.hmset(key, values);
        logger.info("添加成功--");
        close(jedis);
    }

    @Override
    public Map<String, String> getValues(String key) {
        Jedis jedis = jedis();
        if (key == null) {
            return null;
        }
        Map<String, String> map = jedis.hgetAll(key);
        close(jedis);
        logger.info("获取成功--");
        return map;
    }

    @Override
    public void delete(String key) {
        Jedis jedis = jedis();
        if (key == null) {
            return;
        }
        jedis.del(key);
        logger.info("删除成功--");
        close(jedis);
    }

    @Override
    public void delete(String key, String... mapKey) {
        Jedis jedis = jedis();
        if (key == null || mapKey == null) {
            return;
        }
        jedis.hdel(key, mapKey);
        logger.info("删除成功--");
        close(jedis);

    }


    @Override
    public Boolean exist(String key) {
        Jedis jedis = jedis();
        if (key == null) {
            return false;
        }
        boolean exist = jedis.exists(key);
        close(jedis);
        logger.info("查询成功--");
        return exist;
    }

    @Override
    public Boolean exist(String key, String mapKey) {
        Jedis jedis = jedis();
        if (key == null || mapKey == null) {
            return false;
        }
        Boolean exist = jedis.hexists(key, mapKey);
        close(jedis);
        logger.info("查询成功--");
        return exist;
    }


    @Override
    public String getValue(String key, String mapKey) {
        Jedis jedis = jedis();
        if (key == null || mapKey == null) {
            return null;
        }
        String value = jedis.hget(key, mapKey);
        close(jedis);
        logger.info("获取成功--");
        return value;
    }

    @Override
    public Set<String> keys(String pattern) {
        Jedis jedis = jedis();
        if (pattern == null || "".equals(pattern)) {
            pattern = "*";
        }
        Set<String> keys = jedis.keys(pattern);
        close(jedis);
        logger.info("获取成功--");
        return keys;
    }

    @Override
    public String getValue(String key) {
        Jedis jedis = jedis();
        if (key == null) {
            return "";
        }
        String value = jedis.get(key);
        close(jedis);
        return value;
    }

    private Jedis jedis() {
        // jedis.auth("123456")
        return jedisPool.getResource();
    }

    /**
     * 关闭redis链接
     *
     * @param jedis Jedis 链接对象
     */
    private void close(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }

    // 集群使用 注销单机即可
    /*@Resource
    private JedisCluster jedisCluster;

    @Override
    public <T> void addValue(String key, T mapValue) {
        jedisCluster.set(key.getBytes(), SerializeUtil.serialize(mapValue));
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getValue(String key, Class<T> t) {
        return (T) SerializeUtil.unSerialize(jedisCluster.get(key.getBytes()));
    }

    @Override
    public void addValue(String key, String mapKey, String mapValue) {
        if (key == null || mapKey == null || mapValue == null) {
            return;
        }
        jedisCluster.hset(key, mapKey, mapValue);
    }

    @Override
    public void addValues(String key, Map<String, String> values) {
        if (key == null || values == null || values.isEmpty()) {
            return;
        }
        jedisCluster.hmset(key, values);
    }

    @Override
    public Map<String, String> getValues(String key) {
        Jedis jedis = jedis();
        if (key == null) {
            return null;
        }
        return jedisCluster.hgetAll(key);
    }

    @Override
    public Map<String, String> getValuesAndDelete(String key) {
        Jedis jedis = jedis();
        if (key == null) {
            return null;
        }
        Map<String, String> result = jedisCluster.hgetAll(key);
        jedis.del(key);
        close(jedis);
        return result;
    }

    @Override
    public List<String> getValues(String key, Set<String> mapKeys) {
        if (key == null || mapKeys == null || mapKeys.isEmpty()) {
            return null;
        }
        return jedisCluster.hmget(key, mapKeys.toArray(new String[0]));
    }

    @Override
    public void delete(String key) {
        if (key == null) {
            return;
        }
        jedisCluster.del(key);
    }

    @Override
    public void delete(String key, String... mapKey) {
        if (key == null || mapKey == null) {
            return;
        }
        jedisCluster.hdel(key, mapKey);

    }

    @Override
    public void delete(String key, Set<String> mapKeys) {
        if (key == null || mapKeys == null || mapKeys.isEmpty()) {
            return;
        }
        jedisCluster.hdel(key, mapKeys.toArray(new String[0]));
    }

    @Override
    public Boolean exist(String key) {
        if (key == null) {
            return false;
        }
        return jedisCluster.exists(key);
    }

    @Override
    public Boolean exist(String key, String mapKey) {
        if (key == null || mapKey == null) {
            return false;
        }
        return jedisCluster.hexists(key, mapKey);
    }


    @Override
    public String getValue(String key, String mapKey) {
        if (key == null || mapKey == null) {
            return null;
        }
        return jedisCluster.hget(key, mapKey);
    }

    @Override
    public Set<String> keys(String pattern) {
        if (pattern == null || "".equals(pattern)) {
            pattern = "*";
        }
        return jedisCluster.keys(pattern);
    }

    @Override
    public Long hlen(String key) {
        if (key == null) {
            return 0L;
        }
        return jedisCluster.hlen(key);
    }

    @Override
    public Set<String> getHashKeys(String key) {
        if (key == null) {
            return null;
        }
        return jedisCluster.hkeys(key);
    }

    @Override
    public Set<String> smembers(String key) {
        if (key == null) {
            return null;
        }
        return jedisCluster.smembers(key);
    }*/
}
