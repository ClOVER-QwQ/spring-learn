package test;

import com.clover.beans.OtherBean;
import com.clover.beans.OtherBean2;
import com.clover.config.SpringConfig;
import com.clover.dao.UserDao;
import com.clover.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = applicationContext.getBean(UserDao.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        Object otherBean = applicationContext.getBean(OtherBean.class);
        Object otherBean2 = applicationContext.getBean(OtherBean2.class);
        userDao.show();
        System.out.println(userDao);
        System.out.println(userService);
        System.out.println(otherBean);
        System.out.println(otherBean2);
        userService.show();
    }
}
