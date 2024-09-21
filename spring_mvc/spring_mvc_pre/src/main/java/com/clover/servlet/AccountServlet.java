package com.clover.servlet;

import com.clover.service.AccountService;
import com.clover.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "accountServlet", value = "/accountServlet")
public class AccountServlet extends HttpServlet {
    private AccountService accountService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transferMoney("Clover","MoFeng",1000);
    }

    public void setAccountService(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }
}