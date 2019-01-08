package com.anti.theft.service.impl;

import com.anti.theft.dao.CaseBackoutDao;
import com.anti.theft.entity.CaseBackout;
import com.anti.theft.entity.CaseBackoutExample;
import com.anti.theft.service.CaseBackoutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;


/**
 * 案件撤销service实现类
 *
 * @author ZiQiang
 */
@Service
public class CaseBackoutServiceImpl implements CaseBackoutService {

    @Resource
    private CaseBackoutDao caseBackoutDao;

    @Override
    public List<CaseBackout> selectAll(CaseBackoutExample example) {
        return caseBackoutDao.selectByExample(example);
    }

    @Override
    public CaseBackout selectById(Integer id) {
        CaseBackoutDao caseBackoutDao = this.caseBackoutDao;
        List<CaseBackout> caseBackoutList = caseBackoutDao.selectByExample(new CaseBackoutExample());
        AtomicReference<CaseBackout> backout = new AtomicReference<>(new CaseBackout());
        caseBackoutList.forEach(caseBackout -> {
            if (id.equals(caseBackout.getCaseId())) {
                backout.set(caseBackout);
            }
        });
        return backout.get();
    }

    @Override
    public int save(CaseBackout entity) {
        return caseBackoutDao.insertSelective(entity);
    }

    @Override
    public int update(CaseBackout entity, CaseBackoutExample example) {
        return caseBackoutDao.updateByExampleSelective(entity, example);
    }

    @Override
    public int updateById(CaseBackout entity) {
        return caseBackoutDao.updateByExampleSelective(entity, new CaseBackoutExample());
    }

    @Override
    public long count(CaseBackoutExample example) {
        return caseBackoutDao.countByExample(example);
    }

    @Override
    public int delete(CaseBackoutExample example) {
        return caseBackoutDao.deleteByExample(example);
    }

    @Override
    public int deleteById(Integer id) {
        CaseBackoutExample backoutExample = new CaseBackoutExample();
        backoutExample.createCriteria().andCase_idEqualTo(id);
        return caseBackoutDao.deleteByExample(backoutExample);
    }

}
