package com.anti.theft.cache;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

import static com.anti.common.util.Constant.FILE_DELIMITER;

/**
 * 缓存照片信息
 *
 * @author ZiQiang
 */
@Component
public class PhotoCache extends BaseCache {


    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存图片的Base64编码
     *
     * @param model     什么业务的图片，如报警（alarm）,报备（preparation）
     * @param openid    微信打开的openid
     * @param photoName 抓拍照片(photo) 身份证正面(front) 身份证反面(back)
     * @param photo     图片的Base64编码
     * @return 结果
     */
    public String setPhotoCache(String model, String openid, String photoName, String photo) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set(model + FILE_DELIMITER + openid + FILE_DELIMITER + photoName, photo);
        //设置key的有效时间为20分钟
        jedis.expire(model + FILE_DELIMITER + openid + FILE_DELIMITER + photoName, 1200);
        jedis.close();
        return result;
    }

    /**
     * 获取图片的Base64编码
     *
     * @param model     模式
     * @param openid    openid
     * @param photoName 图片名称
     * @return base64编码图片
     */
    public String getPhotoCache(String model, String openid, String photoName) {
        Jedis jedis = getResource(jedisPool);
        String filePath = null;
        if (jedis.exists(model + FILE_DELIMITER + openid + FILE_DELIMITER + photoName)) {
            filePath = jedis.get(model + FILE_DELIMITER + openid + FILE_DELIMITER + photoName);
        }
        jedis.close();
        return filePath;
    }

    /**
     * 删除图片的Base64编码
     *
     * @param model     model
     * @param openid    openid
     * @param photoName photo name
     * @return 结果
     */
    public Long delPhotoCache(String model, String openid, String photoName) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists(model + FILE_DELIMITER + openid + FILE_DELIMITER + photoName)) {
            Long log = jedis.del(model + FILE_DELIMITER + openid + FILE_DELIMITER + photoName);
            jedis.close();
            return log;
        } else {
            return null;
        }
    }
}
