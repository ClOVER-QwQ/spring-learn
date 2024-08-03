package com.clover.service.imp;

import com.clover.service.UserService;
import com.clover.service.dao.UserDao;

public class UserServiceImp implements UserService {
    private UserDao userDao;
    //BeanFactory调用该方法，从容器中获取UserDao设置到此处
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
        System.out.println(userDao);
    }
}
