package com.clover.service.impl;

import com.clover.service.UserService;

public class UserServiceImpl implements UserService {

    public void show1() {
        System.out.println("show1");
    }

    public void show2() {
        System.out.println("show2");
    }

    @Override
    public void show3() {
        System.out.println("show3");
    }
}
