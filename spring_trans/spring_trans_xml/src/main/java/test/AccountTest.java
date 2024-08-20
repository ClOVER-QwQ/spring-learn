package test;

import com.clover.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transferMoney("Clover","MoFeng",1000);
    }
}
