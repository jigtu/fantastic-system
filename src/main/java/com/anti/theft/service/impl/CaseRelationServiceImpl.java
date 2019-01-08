package com.anti.theft.service.impl;

import com.anti.theft.dao.CaseRelationDao;
import com.anti.theft.entity.CaseRelation;
import com.anti.theft.entity.CaseRelationExample;
import com.anti.theft.service.CaseRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author ZiQiang
 */
@Service
public class CaseRelationServiceImpl implements CaseRelationService {

    @Resource
    private CaseRelationDao caseRelationDao;

    @Override
    public List<CaseRelation> selectAll(CaseRelationExample example) {
        return caseRelationDao.selectByExample(example);
    }

    @Override
    public CaseRelation selectById(Integer id) {
        return caseRelationDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(CaseRelation entity) {
        return caseRelationDao.insertSelective(entity);
    }

    @Override
    public int update(CaseRelation entity, CaseRelationExample example) {
        return caseRelationDao.updateByExampleSelective(entity, example);
    }

    @Override
    public int updateById(CaseRelation entity) {
        return caseRelationDao.updateByPrimaryKey(entity);
    }

    @Override
    public long count(CaseRelationExample example) {
        return caseRelationDao.countByExample(example);
    }

    @Override
    public int delete(CaseRelationExample example) {
        return caseRelationDao.deleteByExample(example);
    }

    @Override
    public int deleteById(Integer id) {
        return caseRelationDao.deleteByPrimaryKey(id);
    }
}
