package com.example.demos9.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demos9.mapper.UserMapper;
import com.example.demos9.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserApiImpl extends ServiceImpl<UserMapper,User> implements UserApi {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        this.save(user);
    }
}
