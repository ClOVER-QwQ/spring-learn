package com.clover.service.imp;

import com.clover.dao.UserDao;
import com.clover.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserServiceImp implements UserService, InitializingBean {
    public UserServiceImp(){
        System.out.println("无参构造");
    }

    public UserServiceImp(String name){
        System.out.println("有参构造");
        System.out.println(name);
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("afterPropertiesSet");
    }

    private List<UserDao> userDaoList;

    public void setUserDaoList(List<UserDao> userDaoList) {
        this.userDaoList = userDaoList;
    }

    private List<String> strings;

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    private Set<String> stringSet;

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    private Set<UserDao> userDaoSet;

    public void setUserDaoSet(Set<UserDao> userDaoSet) {
        this.userDaoSet = userDaoSet;
    }

    private Map<String,UserDao> map;

    public void setMap(Map<String, UserDao> map) {
        this.map = map;
    }

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void show(){
        System.out.println(strings);
        System.out.println(userDaoList);
        System.out.println(stringSet);
        System.out.println(userDaoSet);
        System.out.println(map);
        System.out.println(properties);
    }

}
