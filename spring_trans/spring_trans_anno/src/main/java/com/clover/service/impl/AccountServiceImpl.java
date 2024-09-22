package com.clover.service.impl;

import com.clover.mapper.AccountMapper;
import com.clover.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
//@Transactional(全局配置)
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        //开启事务
        //try catch或者交给Spring
        accountMapper.decrMoney(outAccount,money);
        accountMapper.incrMoney(inAccount,money);
    }
}
