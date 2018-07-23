package com.cherry.springboot.service;

import com.cherry.springboot.entity.User;

/**
 * @author zhangpcxy@163.com
 * @create 2018/7/23 15:47
 * @desc
 */
public interface IUserService {

    User selectByPrimaryKey(Integer id);

}
