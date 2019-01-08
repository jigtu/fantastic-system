package com.anti.theft.service.impl;

import com.anti.theft.dao.BlackListLogDao;
import com.anti.theft.entity.BlackListLog;
import com.anti.theft.entity.BlackListLogExample;
import com.anti.theft.service.BlackListLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZiQiang
 */
@Service
public class BlackListLogServiceImpl implements BlackListLogService {
    @Resource
    private BlackListLogDao blackListLogDao;

    @Override
    public List<BlackListLog> selectAll(BlackListLogExample example) {
        return blackListLogDao.selectByExample(example);
    }

    @Override
    public BlackListLog selectById(Integer id) {
        return blackListLogDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(BlackListLog entity) {
        return blackListLogDao.insertSelective(entity);
    }

    @Override
    public int update(BlackListLog entity, BlackListLogExample example) {
        return blackListLogDao.updateByExampleSelective(entity, example);
    }

    @Override
    public int updateById(BlackListLog entity) {
        return blackListLogDao.updateByPrimaryKey(entity);
    }

    @Override
    public long count(BlackListLogExample example) {
        return blackListLogDao.countByExample(example);
    }

    @Override
    public int delete(BlackListLogExample example) {
        return blackListLogDao.deleteByExample(example);
    }

    @Override
    public int deleteById(Integer id) {
        return blackListLogDao.deleteByPrimaryKey(id);
    }
}
