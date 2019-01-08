package com.anti.theft.dao;

import com.anti.theft.entity.CaseInformation;
import com.anti.theft.entity.CaseInformationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface CaseInformationDao {
    long countByExample(CaseInformationExample example);

    int deleteByExample(CaseInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaseInformation record);

    int insertSelective(CaseInformation record);

    List<CaseInformation> selectByExample(CaseInformationExample example);

    CaseInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaseInformation record, @Param("example") CaseInformationExample example);

    int updateByExample(@Param("record") CaseInformation record, @Param("example") CaseInformationExample example);

    int updateByPrimaryKeySelective(CaseInformation record);

    int updateByPrimaryKey(CaseInformation record);
}