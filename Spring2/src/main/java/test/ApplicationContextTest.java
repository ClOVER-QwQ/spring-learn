package test;

import com.clover.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        Object userService =applicationContext.getBean("userService");
        userDao.show();
        System.out.println(userDao);
        System.out.println(userService);
    }
}
