package com.clover.dao.impl;

import com.clover.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("userDao")
@Scope("singleton")
@Lazy(false)
public class UserDaoImpl implements UserDao {
    @Value("张三")
    private String username;
    @Override
    public void show(){
        System.out.println(username);
    }
    public UserDaoImpl(){
        System.out.println("UserDaoIMPL");
    }
    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
