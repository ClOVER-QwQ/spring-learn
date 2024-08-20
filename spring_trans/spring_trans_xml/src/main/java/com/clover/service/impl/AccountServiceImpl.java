package com.clover.service.impl;

import com.clover.mapper.AccountMapper;
import com.clover.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountMapper accountMapper;
    @Override
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decrMoney(outAccount,money);
        accountMapper.incrMoney(inAccount,money);
    }
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }
}
