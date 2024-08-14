package com.clover.dao.imp;

import com.clover.dao.WorkDao;
import org.springframework.beans.factory.InitializingBean;

public class WorkDaoImp implements WorkDao, InitializingBean {
    public WorkDaoImp(){
        System.out.println("workDao IMP");
    }

    private void init() {
        System.out.println("workDao init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
