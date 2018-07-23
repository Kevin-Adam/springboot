package com.cherry.springboot.service.impl;

import com.cherry.springboot.dao.IUserDao;
import com.cherry.springboot.entity.User;
import com.cherry.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangpcxy@163.com
 * @create 2018/7/23 15:49
 * @desc
 */
@Service
public class UserServiceIpml implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
