package com.anti.theft.cache;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

import static com.anti.common.util.Constant.FILE_DELIMITER;

/**
 * 缓存bao
 *
 * @author ZiQiang
 */
@Component
public class FilePathCache extends BaseCache {


    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存文件的存储路径
     *
     * @param name 文件名
     * @param id   文件id
     * @param path 文件路径
     * @return 保存结果
     */
    public String setFilePathCache(String name, Integer id, String path) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set(name + FILE_DELIMITER + String.valueOf(id), path);
        jedis.close();
        return result;
    }

    /**
     * 获取app用户
     *
     * @param id id
     * @return 信息
     */
    public String getFilePathCache(String name, Integer id) {
        String filePath = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists(name + FILE_DELIMITER + String.valueOf(id))) {
            filePath = jedis.get(name + FILE_DELIMITER + String.valueOf(id));
        }
        jedis.close();
        return filePath;
    }

    /**
     * 删除文件路径
     *
     * @param name 文件名
     * @param id   文件id
     * @return 删除结果
     */
    public Long delFilePathCache(String name, Integer id) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists(name + FILE_DELIMITER + String.valueOf(id))) {
            Long log = jedis.del(name + FILE_DELIMITER + String.valueOf(id));
            jedis.close();
            return log;
        } else {
            return null;
        }
    }
}
