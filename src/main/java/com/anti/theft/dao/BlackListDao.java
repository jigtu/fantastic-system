package com.anti.theft.dao;

import com.anti.theft.entity.BlackList;
import com.anti.theft.entity.BlackListExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface BlackListDao {
    long countByExample(BlackListExample example);

    int deleteByExample(BlackListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlackList record);

    int insertSelective(BlackList record);

    List<BlackList> selectByExample(BlackListExample example);

    BlackList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlackList record, @Param("example") BlackListExample example);

    int updateByExample(@Param("record") BlackList record, @Param("example") BlackListExample example);

    int updateByPrimaryKeySelective(BlackList record);

    int updateByPrimaryKey(BlackList record);
}