package main;

import com.clover.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DifEnviBeansTest {
    public static void main(String[] args) {
        System.setProperty("spring.profile.active","dev");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userService = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userService);
    }
}
