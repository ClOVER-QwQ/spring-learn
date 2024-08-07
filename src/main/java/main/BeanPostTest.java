package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanpost.xml");
        Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);
//        Object operatorDao = applicationContext.getBean("beanDefinitionRegistry");
//        System.out.println(operatorDao);
//        Object otherBeans = applicationContext.getBean("otherBean");
//        System.out.println(otherBeans);
    }
}
