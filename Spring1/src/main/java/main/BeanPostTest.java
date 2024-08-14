package main;

import com.clover.dao.WorkDao;
import com.clover.dao.imp.WorkDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanpost.xml");
        WorkDao userDao = (WorkDao) applicationContext.getBean("userDao");
        userDao.show();
//        Object operatorDao = applicationContext.getBean("beanDefinitionRegistry");
//        System.out.println(operatorDao);
//        Object otherBeans = applicationContext.getBean("otherBean");
//        System.out.println(otherBeans);
    }
}
