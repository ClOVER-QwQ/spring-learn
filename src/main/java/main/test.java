package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test {
    public static void main(String[] args){
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
            Object UserDao = applicationContext.getBean("userDao3");//beanname
            System.out.println(UserDao);
    }
}
