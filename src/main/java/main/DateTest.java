package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("date.xml");
        Date date = applicationContext.getBean("date",Date.class);
        System.out.println(date);
    }
}
