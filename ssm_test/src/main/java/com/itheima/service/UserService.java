package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domin.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author XYL
 * @create 2020-07-01-18:58
 */
@Transactional(readOnly = true)
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param uuid
     * @return
     */
    public User findById(Integer uuid);


}
