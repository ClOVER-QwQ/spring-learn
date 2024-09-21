package test;

import com.clover.config.SpringConfig;
import com.clover.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transferMoney("Clover","MoFeng",1000);
    }
}
