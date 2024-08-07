package com.clover.dao.imp;

import com.clover.dao.WorkDao;

public class WorkDaoImp implements WorkDao {
    public WorkDaoImp(){
        System.out.println("workDao IMP");
    }

    private void init() {
        System.out.println("workDao init");
    }
}
