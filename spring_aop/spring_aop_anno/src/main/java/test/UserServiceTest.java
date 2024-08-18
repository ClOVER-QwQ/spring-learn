package test;

import com.clover.config.SpringConfig;
import com.clover.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show1();
    }
}
