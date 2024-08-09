package com.clover.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.Date;

public class MyBeanPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+":post before initialization");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+":post after initialization");
        //使用动态代理对目标Bean进行增强，返回proxy对象，进而存储到单例池singletonobjects中
        Object beanproxy = Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) ->
                {
                    //1、输出开始时间
                    System.out.println("方法:" + method.getName() + "-开始时间:" + new Date());
                    //2、执行目标方法
                    Object result = method.invoke(bean, args);
                    //3、输出结束树间
                    System.out.println("方法:" + method.getName() + "-结束时间:" + new Date());
                    return result;
                });
        return beanproxy;
    }
}
