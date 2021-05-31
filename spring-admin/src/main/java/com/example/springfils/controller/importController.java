package com.example.springfils.controller;


import com.examole.springfils.entity.User;
import com.examole.springfils.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RequestMapping("/import")
public class importController {
    @Resource
    UserServiceImpl userServiceImpl;

//    获取用户数据
    @GetMapping("/getList")
    public List<User> getList(){
        List<User> list=userServiceImpl.getList();
        return list;
    }




}
