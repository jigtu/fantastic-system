package com.anti.theft.cache;

import com.anti.common.util.Constant;
import com.anti.theft.entity.CaseBackout;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * 缓存撤销人的信息
 *
 * @author ZiQiang
 */
@Component
public class BackoutCache extends BaseCache {

    @Resource
    private JedisPool jedisPool;

    /**
     * 缓存撤销人信息
     *
     * @param caseBackout 案件
     * @return 结果
     */
    public String setBackoutCache(CaseBackout caseBackout) {
        Jedis jedis = getResource(jedisPool);
        String result = jedis.set((Constant.BACKOUT + caseBackout.getOpenid()).getBytes(), serialize(caseBackout));
        //设置key的有效时间为20分钟
        jedis.expire((Constant.BACKOUT + caseBackout.getOpenid()).getBytes(), Constant.TTL_IN_SEC);
        jedis.close();
        return result;
    }

    /**
     * 获取撤销人的缓存信息
     *
     * @param openid openid
     * @return 案件信息
     */
    public CaseBackout getBackoutCache(String openid) {
        CaseBackout caseBackout = null;
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((Constant.BACKOUT + openid).getBytes())) {
            caseBackout = (CaseBackout) deserialize(jedis.get((Constant.BACKOUT + openid).getBytes()));
        }
        jedis.close();
        return caseBackout;
    }

    /**
     * 删除撤销人的缓存信息
     *
     * @param openid openid
     * @return 结果
     */
    public Long delBackoutCache(String openid) {
        Jedis jedis = getResource(jedisPool);
        if (jedis.exists((Constant.BACKOUT + openid).getBytes())) {
            Long log = jedis.del((Constant.BACKOUT + openid).getBytes());
            jedis.close();
            return log;
        } else {
            return null;
        }
    }

}
