package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThirdPartyBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ThirdPartyBean.xml");
        Object datasource = applicationContext.getBean("datasource");
        System.out.println(datasource);
        Object connection = applicationContext.getBean("connection");
        System.out.println(connection);
    }
}
