package com.anti.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * Redis 的集群以及单机模式配置类
 * 1、使用单机模式 将jedisCluster 方法的@Bean注解注销
 * 2、使用集群模式 将jedisPool    方法的@Bean注解注销
 * 将cluster的@Value注解打开 其余的注销
 *
 * @author ZiQiang
 */
@Configuration
public class RedisConfig {
    private static Logger logger = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${spring.redis.timeout}")
    private String timeout;
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.password}")
    private String password;
    /**
     * 使用@注解Value("${spring.redis.cluster.nodes}")
     */
    private String cluster;
    @Value("${spring.redis.port}")
    private Integer port;

    /**
     * 构建集群的 JedisCluster
     *
     * @return JedisCluster
     */
    public JedisCluster jedisCluster() {
        Set<HostAndPort> jedisClusterNodes = new HashSet<>();
        String[] ipPorts = cluster.split(",");
        if (ipPorts.length > 0) {
            for (String ipPort : ipPorts) {
                String[] host = ipPort.split(":");
                jedisClusterNodes.add(new HostAndPort(host[0], Integer.valueOf(host[1])));
            }
        }
        //设置超时以及
        return new JedisCluster(jedisClusterNodes, 6000, 3);
    }

    @Bean
    public JedisPool jedisPool() {
        logger.info("JedisPool注入成功！！  " + "Redis地址：" + host + ":" + port);
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(8);
        jedisPoolConfig.setMaxWaitMillis(100);
        return new JedisPool(host, port);
    }
}
