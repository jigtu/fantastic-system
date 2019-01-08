package com.anti.theft.dao;

import com.anti.theft.entity.CaseBackout;
import com.anti.theft.entity.CaseBackoutExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface CaseBackoutDao {
    long countByExample(CaseBackoutExample example);

    int deleteByExample(CaseBackoutExample example);

    int insert(CaseBackout record);

    int insertSelective(CaseBackout record);

    List<CaseBackout> selectByExample(CaseBackoutExample example);

    int updateByExampleSelective(@Param("record") CaseBackout record, @Param("example") CaseBackoutExample example);

    int updateByExample(@Param("record") CaseBackout record, @Param("example") CaseBackoutExample example);
}