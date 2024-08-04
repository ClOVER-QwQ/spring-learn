package com.clover.factory;

import com.clover.dao.UserDao;
import com.clover.service.imp.UserDaoImp;

public class BeanFactoryStatic {
    public static UserDao userDao(){
        return new UserDaoImp();
    }
}
