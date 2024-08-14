package com.clover.factory;

import com.clover.dao.UserDao;
import com.clover.dao.imp.UserDaoImp;
import org.springframework.beans.factory.FactoryBean;

public class BeanFactoryFB implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new UserDaoImp();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
