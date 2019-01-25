package com.yingjun.yingjun.zhuyingjun.controller;

import com.yingjun.yingjun.zhuyingjun.entity.User;
import com.yingjun.yingjun.zhuyingjun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class RWController {


    @Autowired
    UserService userService;

    //走数据源1库
    @GetMapping(value = "/test1")
    @ResponseBody
    public String testOne(){
        List<User> userList = userService.getAllUser1();
        System.out.println(userList.size());
        return "success";
    }

    //使用数据源2插入数据
    @GetMapping(value = "/test2")
    @ResponseBody
    public String testTwo(){
        User user = new User("mjt02",20);
        userService.addUser2(user);
        return "success";
    }

}