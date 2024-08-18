package com.clover.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
@Aspect
public class MyAdvice{
    @Pointcut("execution(* com.clover.service.impl.UserServiceImpl.show1())")
    public void myPointcut(){
    }
    @Around("myPointcut()")
    public Object around(@NotNull ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("前置增强开始-开始时间:" + new Date());
        System.out.println("目标方法的参数:"+ Arrays.toString(joinPoint.getArgs()));//获得目标方法的参数
        System.out.println("当前对象是:"+joinPoint.getClass());
        System.out.println("表达式为:"+joinPoint.getStaticPart());
        Object result=joinPoint.proceed();//执行目标方法
        System.out.println("后置增强结束-结束时间:" + new Date());
        return result;//返回目标方法返回值
    }
}
