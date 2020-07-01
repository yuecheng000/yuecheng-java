package com.itheima.controller;

import com.itheima.domin.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XYL
 * @create 2020-07-01-19:01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User userFindById(@PathVariable Integer id){

        User user = userService.findById(id);

        return user;
    }



}
