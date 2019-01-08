package com.anti.theft.dao;

import com.anti.theft.entity.AppealInformation;
import com.anti.theft.entity.AppealInformationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZiQiang
 */
public interface AppealInformationDao {
    long countByExample(AppealInformationExample example);

    int deleteByExample(AppealInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppealInformation record);

    int insertSelective(AppealInformation record);

    List<AppealInformation> selectByExample(AppealInformationExample example);

    AppealInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppealInformation record, @Param("example") AppealInformationExample example);

    int updateByExample(@Param("record") AppealInformation record, @Param("example") AppealInformationExample example);

    int updateByPrimaryKeySelective(AppealInformation record);

    int updateByPrimaryKey(AppealInformation record);
}