package main;

import com.clover.mapper.UserMapper;
import com.clover.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");//静态工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();//无参构造
        SqlSessionFactory sqlSessionFactory = builder.build(in);//实例化工厂方法
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mybatis-bean.xml");
//        Object sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
