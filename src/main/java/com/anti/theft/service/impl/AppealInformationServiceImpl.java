package com.anti.theft.service.impl;

import com.anti.theft.dao.AppealInformationDao;
import com.anti.theft.entity.AppealInformation;
import com.anti.theft.entity.AppealInformationExample;
import com.anti.theft.service.AppealInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (申诉信息service实现）
 *
 * @author ZiQiang
 */
@Service
public class AppealInformationServiceImpl implements AppealInformationService {

    @Resource
    private AppealInformationDao appealInformationDao;

    @Override
    public List<AppealInformation> selectAll(AppealInformationExample example) {
        return appealInformationDao.selectByExample(example);
    }

    @Override
    public AppealInformation selectById(Integer id) {
        return appealInformationDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(AppealInformation entity) {
        return appealInformationDao.insertSelective(entity);
    }

    @Override
    public int update(AppealInformation entity, AppealInformationExample example) {
        return appealInformationDao.updateByExampleSelective(entity, example);
    }

    @Override
    public int updateById(AppealInformation entity) {
        return appealInformationDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public long count(AppealInformationExample example) {
        return appealInformationDao.countByExample(example);
    }

    @Override
    public int delete(AppealInformationExample example) {
        return appealInformationDao.deleteByExample(example);
    }

    @Override
    public int deleteById(Integer id) {
        return appealInformationDao.deleteByPrimaryKey(id);
    }

}
