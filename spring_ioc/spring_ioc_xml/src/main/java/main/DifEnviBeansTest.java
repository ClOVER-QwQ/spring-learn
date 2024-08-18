package main;

import com.clover.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DifEnviBeansTest {
    public static void main(String[] args) {
        System.setProperty("spring.profile.active","dev");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService =  applicationContext.getBean("userService",UserService.class);
        System.out.println(userService);
    }
}
