package com.anti.theft.service.impl;

import com.anti.theft.dao.BlackListDao;
import com.anti.theft.entity.BlackList;
import com.anti.theft.entity.BlackListExample;
import com.anti.theft.service.BlackListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 黑名单service实现
 *
 * @author ZiQiang
 */
@Service
public class BlackListServiceImpl implements BlackListService {
    @Resource
    private BlackListDao blackListDao;

    @Override
    public List<BlackList> selectAll(BlackListExample example) {
        return blackListDao.selectByExample(example);
    }

    @Override
    public BlackList selectById(Integer id) {
        return blackListDao.selectByPrimaryKey(id);
    }


    @Override
    public int save(BlackList entity) {
        // TODO Auto-generated method stub
        return blackListDao.insertSelective(entity);
    }

    @Override
    public int update(BlackList entity, BlackListExample example) {
        return blackListDao.updateByExampleSelective(entity, example);
    }

    @Override
    public int updateById(BlackList entity) {
        return blackListDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public long count(BlackListExample example) {
        return blackListDao.countByExample(example);
    }

    @Override
    public int delete(BlackListExample example) {
        return blackListDao.deleteByExample(example);
    }

    @Override
    public int deleteById(Integer id) {
        return blackListDao.deleteByPrimaryKey(id);
    }
}
