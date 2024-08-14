package main;

import com.clover.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) {
//        ApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();
    }
}
