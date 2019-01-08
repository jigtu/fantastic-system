package com.anti.theft.cache;

import com.anti.common.util.Constant;
import com.anti.theft.entity.CaseInformation;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

import static com.anti.common.util.Constant.ALARM;
import static com.anti.common.util.Constant.TTL_IN_SEC;

/**
 * 缓存报警信息
 *
 * @author ZiQiang
 */
@Component
public class CaseCache extends BaseCache {


    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存报警信息
     *
     * @param caseInformation 报警信息
     * @return 结果
     */
    public String setCaseCache(CaseInformation caseInformation) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set((ALARM + caseInformation.getAlarmPeopleOpenid()).getBytes(), serialize(caseInformation));
        //设置key的有效时间为20分钟
        jedis.expire((ALARM + caseInformation.getAlarmPeopleOpenid()).getBytes(), TTL_IN_SEC);
        jedis.close();
        return result;
    }

    /**
     * 获取报警信息
     *
     * @param openid openid
     * @return 缓存信息
     */
    public CaseInformation getCaseCache(String openid) {
        CaseInformation caseInformation = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((ALARM + openid).getBytes())) {
            caseInformation = (CaseInformation) deserialize(jedis.get((ALARM + openid).getBytes()));
        }
        jedis.close();
        return caseInformation;
    }

    /**
     * 删除缓存的报警信息
     *
     * @param openid openid
     * @return 结果
     */
    public Long delCaseCache(String openid) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((ALARM + openid).getBytes())) {
            Long log = jedis.del((ALARM + openid).getBytes());
            jedis.close();
            return log;
        } else {
            return 2L;
        }
    }

}
