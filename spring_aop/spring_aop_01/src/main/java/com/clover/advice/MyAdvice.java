package com.clover.advice;
public class MyAdvice {
    public void beforeAdvice(){
        System.out.println("前置增强");
    }
    public void afterAdvice(){
        System.out.println("后置增强");
    }
}
