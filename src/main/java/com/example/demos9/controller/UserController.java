package com.example.demos9.controller;

import com.example.demos9.pojo.User;
import com.example.demos9.service.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user/")
@RestController
public class UserController {

    @Autowired
    private UserApi userApi;

    @RequestMapping("add")
     public void addUser(){
        User user = new User();
        user.setName("aaa");
        user.setPwd("123");
        userApi.addUser(user);
    }
}
