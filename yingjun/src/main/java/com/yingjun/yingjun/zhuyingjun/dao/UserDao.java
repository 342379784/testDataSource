package com.yingjun.yingjun.zhuyingjun.dao;

import com.yingjun.yingjun.zhuyingjun.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserDao {

    @Select(value = "select * from user")
    List<User> getAllUser();
    Long addUserGetID(User user);


    void addUser(User user);
}
