package com.anti.theft.service.impl;

import com.anti.theft.dao.CaseInformationDao;
import com.anti.theft.entity.CaseInformation;
import com.anti.theft.entity.CaseInformationExample;
import com.anti.theft.service.CaseInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 报警流程service实现类
 *
 * @author ZiQiang
 */
@Service
public class CaseInformationServiceImpl implements CaseInformationService {

    @Resource
    private CaseInformationDao caseInformationDao;

    @Override
    public List<CaseInformation> selectAll(CaseInformationExample example) {
        return caseInformationDao.selectByExample(example);
    }

    @Override
    public CaseInformation selectById(Integer id) {
        return caseInformationDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(CaseInformation entity) {
        return caseInformationDao.insertSelective(entity);
    }

    @Override
    public int update(CaseInformation entity, CaseInformationExample example) {
        return caseInformationDao.updateByExampleSelective(entity, example);
    }

    @Override
    public int updateById(CaseInformation entity) {
        return caseInformationDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public long count(CaseInformationExample example) {
        return caseInformationDao.countByExample(example);
    }

    @Override
    public int delete(CaseInformationExample example) {
        return caseInformationDao.deleteByExample(example);
    }

    @Override
    public int deleteById(Integer id) {
        return caseInformationDao.deleteByPrimaryKey(id);
    }
}
