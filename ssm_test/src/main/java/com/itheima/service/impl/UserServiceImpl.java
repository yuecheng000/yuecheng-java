package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domin.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XYL
 * @create 2020-07-01-18:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer uuid) {
        return userDao.findById(uuid);
    }
}
