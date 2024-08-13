package com.clover.dao.imp;

import com.clover.dao.WorkDao;
import org.springframework.beans.factory.InitializingBean;

public class WorkDaoImp implements WorkDao, InitializingBean {
    public WorkDaoImp(){
        System.out.println("workDao IMP");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet");
    }
}
