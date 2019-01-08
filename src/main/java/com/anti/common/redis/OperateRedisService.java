package com.anti.common.redis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ZiQiang
 */
public interface OperateRedisService {


    /**
     * 向redis中添加缓存（T类型）
     *
     * @param key      key
     * @param mapValue 泛型的值
     * @param <T>      泛型T
     */
    <T> void addValue(String key, T mapValue);

    /**
     * 设置值 并设置有效期
     *
     * @param key     key
     * @param seconds 有效期（时间为秒）
     * @param value   值
     */
    void addValue(String key, Integer seconds, String value);

    /**
     * 添加缓存
     * 相当于Map<String,Map<String,String>
     *
     * @param key      key
     * @param mapKey   map的key
     * @param mapValue map的值
     */
    void addValue(String key, String mapKey, String mapValue);

    /**
     * 添加缓存
     *
     * @param key   key
     * @param value 值
     */
    void addValue(String key, String value);

    /**
     * 向redis中添加缓存
     *
     * @param key    key
     * @param values Map
     */
    void addValues(String key, Map<String, String> values);

    /**
     * 获取值
     *
     * @param key key
     * @return 值
     */
    String getValue(String key);

    /**
     * 获取缓存（T类型）
     *
     * @param key key
     * @param <T> 泛型对象
     * @param t   Class T
     * @return T类型的结果
     */
    <T> T getValue(String key, Class<T> t);

    /**
     * 获取缓存
     *
     * @param key 缓存key
     * @return map
     */
    Map<String, String> getValues(String key);

    /**
     * 获取缓存值（单个）
     *
     * @param key    key
     * @param mapKey mapKey
     * @return 结果
     */
    String getValue(String key, String mapKey);

    /**
     * 获取redis中指定格式的key
     *
     * @param pattern 格式 可以使用*
     * @return 符合格式的key
     */
    Set<String> keys(String pattern);

    /**
     * 删除缓存
     *
     * @param key 缓存key
     */
    void delete(String key);

    /**
     * 删除哈希缓存
     *
     * @param key    缓存key
     * @param mapKey map key（参数多个）
     */
    void delete(String key, String... mapKey);


    /**
     * 缓存key是否存在
     *
     * @param key key
     * @return true 或者false
     */
    Boolean exist(String key);

    /**
     * 判断key是否存在
     *
     * @param key    key
     * @param mapKey mapKey
     * @return true 或者false
     */
    Boolean exist(String key, String mapKey);
}
