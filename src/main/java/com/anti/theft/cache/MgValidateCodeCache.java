package com.anti.theft.cache;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

import static com.anti.common.util.Constant.VALIDATE_CODE;


/**
 * @author ZiQiang
 */
@Component
public class MgValidateCodeCache extends BaseCache {

    @Resource
    private JedisPool jedisPool;

    /**
     * 保存验证码
     *
     * @param phoneNum   电话号码
     * @param statusCode 状态码
     * @param time       过期时间 s
     * @return 结果
     */
    public String setMgValidateCode(String phoneNum, String statusCode, long time) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set(VALIDATE_CODE + phoneNum, statusCode);
        jedis.expire(VALIDATE_CODE + phoneNum, (int) time);
        jedis.close();
        return result;
    }

    /**
     * 获取验证码
     *
     * @param phoneNum 电话号码
     * @return 验证码
     */
    public String getMgValidateCode(String phoneNum) {
        String value = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists(VALIDATE_CODE + phoneNum)) {
            value = jedis.get(VALIDATE_CODE + phoneNum);
        }
        jedis.close();
        return value;
    }
}
