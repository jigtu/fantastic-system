package com.anti.theft.dao;

import com.anti.theft.entity.BlackListLog;
import com.anti.theft.entity.BlackListLogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface BlackListLogDao {
    long countByExample(BlackListLogExample example);

    int deleteByExample(BlackListLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlackListLog record);

    int insertSelective(BlackListLog record);

    List<BlackListLog> selectByExample(BlackListLogExample example);

    BlackListLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlackListLog record, @Param("example") BlackListLogExample example);

    int updateByExample(@Param("record") BlackListLog record, @Param("example") BlackListLogExample example);

    int updateByPrimaryKeySelective(BlackListLog record);

    int updateByPrimaryKey(BlackListLog record);
}