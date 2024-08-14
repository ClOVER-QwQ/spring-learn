package com.clover.processor;

import com.clover.utils.BaseClassScanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.util.Map;

import static com.clover.utils.BaseClassScanUtils.scanMyComponentAnnotation;

public class MyComponentBeaFactoryPostProcess implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //通过扫描工具扫描指定包和子包的所有类
        Map<String, Class> stringClassMap = scanMyComponentAnnotation("com.clover");
        //遍历Map，组装BeanDefinition
        stringClassMap.forEach((beanName,clszz)->{
            //获取beanClassName
            String beanClassName = clszz.getName();//com.clover.beans.OtherBean
            //创建BeanDefinition
            BeanDefinition beanDefinition = new RootBeanDefinition();
            beanDefinition.setBeanClassName(beanClassName);
            beanDefinitionRegistry.registerBeanDefinition(beanName,beanDefinition);
        });
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
