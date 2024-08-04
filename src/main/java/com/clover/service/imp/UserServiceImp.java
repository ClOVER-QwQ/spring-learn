package com.clover.service.imp;

import com.clover.dao.UserDao;
import com.clover.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImp implements UserService, InitializingBean {
    public UserServiceImp(){
        System.out.println("无参构造");
    }

    public UserServiceImp(String name){
        System.out.println("有参构造");
    }
    private UserDao userDao;
    //BeanFactory调用该方法，从容器中获取UserDao设置到此处
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
        System.out.println(userDao);
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
