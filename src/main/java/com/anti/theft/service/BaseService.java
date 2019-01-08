package com.anti.theft.service;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface BaseService<T, V> {
    /**
     * <p>Title: selectByExample</p>
     * <p>Description:动态查询(selectByExample) </p>
     *
     * @param example
     * @return
     */
    List<T> selectAll(V example);

    /**
     * <p>Title: selectByExample</p>
     * <p>Description:按主键查询 (selectByPrimaryKey)</p>
     *
     * @param id
     * @return
     */
    T selectById(Integer id);

    /**
     * <p>Title: save</p>
     * <p>Description:添加(insertSelective) </p>
     *
     * @param entity
     * @return
     */
    int save(T entity);

    /**
     * <p>Title: update</p>
     * <p>Description: 动态修改(updateByExampleSelective)</p>
     *
     * @param entity
     * @param example
     * @return
     */
    int update(T entity, V example);

    /**
     * <p>Title: updateById</p>
     * <p>Description:按主键修改(updateByPrimaryKeySelective) </p>
     *
     * @param entity
     * @return
     */
    int updateById(T entity);

    /**
     * <p>Title: count</p>
     * <p>Description: 动态查询总条数(countByExample)</p>
     *
     * @param example
     * @return
     */
    long count(V example);

    /**
     * <p>Title: deleteByExample</p>
     * <p>Description:动态删除(deleteByExample) </p>
     *
     * @param example V
     * @return 结果
     */
    int delete(V example);

    /**
     * <p>Title: deleteByPrimaryKey</p>
     * <p>Description:按主键删除(deleteByPrimaryKey) </p>
     *
     * @param id id
     * @return 结果
     */
    int deleteById(Integer id);
}