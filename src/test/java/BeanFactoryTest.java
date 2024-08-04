import com.clover.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        //创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建读取器（读取xml文件）,绑定BeanFactory
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //读取xml文件
        reader.loadBeanDefinitions("applicationcontext.xml");
        //根据id获得bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);
    }
}
