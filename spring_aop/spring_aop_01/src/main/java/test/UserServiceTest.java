package test;

import com.clover.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show1();
        userService.show2();
    }
}
