package com.examole.springfils.service.impl;

import com.examole.springfils.entity.User;
import com.examole.springfils.domain.UserMapper;
import com.examole.springfils.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
