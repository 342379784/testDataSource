package com.yingjun.yingjun.zhuyingjun.service;

import com.yingjun.yingjun.zhuyingjun.dao.UserDao;
import com.yingjun.yingjun.zhuyingjun.dataSourceConfig.DS;
import com.yingjun.yingjun.zhuyingjun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao moredataDao;

    //使用数据源1查询
    @DS("datasource1")
    public List<User> getAllUser1(){
        return moredataDao.getAllUser();
    }
    //使用数据源2查询
    @DS("datasource2")
    public List<User> getAllUser2(){
        return moredataDao.getAllUser();
    }

    //使用数据源1插入数据
    @DS("datasource1")
    public Long addUserGetID1(User user){
        return moredataDao.addUserGetID(user);
    }
    //使用数据源1插入数据
    @DS("datasource2")
    public Long addUserGetID2(User user){
        return moredataDao.addUserGetID(user);
    }

    //使用数据源1插入数据
    @DS("datasource1")
    public void addUser1(User user){
        moredataDao.addUser(user);
    }

    //使用数据源2插入数据
    @DS("datasource2")
    public void addUser2(User user){
        moredataDao.addUser(user);
    }

    @Transactional
    public void test1(){

        moredataDao.addUserGetID(new User("mdx1",18));
        int a =10/0;
        moredataDao.addUserGetID(new User("mdxl1",20));

    }

}
