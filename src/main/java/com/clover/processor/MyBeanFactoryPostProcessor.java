package com.clover.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("填充完毕后回调");
        //修改某个BeanDefinition
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("userDao");
        beanDefinition.setBeanClassName("com.clover.dao.imp.WorkDaoImp");
        //添加BeanDefinition
//        BeanDefinition operatorBD = new RootBeanDefinition();
//        operatorBD.setBeanClassName("com.dao.imp.operatorDaoImp");
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) operatorBD;
//        defaultListableBeanFactory.registerBeanDefinition("operator",operatorBD);
    }
}
