package com.clover.dao.imp;

import com.clover.dao.UserDao;

public class UserDaoImp implements UserDao {
    public UserDaoImp(){
        System.out.println("userDao IMP");
    }

    private void init() {
        System.out.println("userDao init");
    }
}
