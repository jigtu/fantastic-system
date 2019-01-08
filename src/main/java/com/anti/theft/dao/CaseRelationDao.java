package com.anti.theft.dao;

import com.anti.theft.entity.CaseRelation;
import com.anti.theft.entity.CaseRelationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface CaseRelationDao {
    long countByExample(CaseRelationExample example);

    int deleteByExample(CaseRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaseRelation record);

    int insertSelective(CaseRelation record);

    List<CaseRelation> selectByExample(CaseRelationExample example);

    CaseRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaseRelation record, @Param("example") CaseRelationExample example);

    int updateByExample(@Param("record") CaseRelation record, @Param("example") CaseRelationExample example);

    int updateByPrimaryKeySelective(CaseRelation record);

    int updateByPrimaryKey(CaseRelation record);
}