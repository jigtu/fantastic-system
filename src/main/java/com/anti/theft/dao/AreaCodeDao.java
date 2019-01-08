package com.anti.theft.dao;

import com.anti.theft.entity.AreaCode;
import com.anti.theft.entity.AreaCodeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface AreaCodeDao {
    long countByExample(AreaCodeExample example);

    int deleteByExample(AreaCodeExample example);

    int insert(AreaCode record);

    int insertSelective(AreaCode record);

    List<AreaCode> selectByExample(AreaCodeExample example);

    int updateByExampleSelective(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByExample(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);
}