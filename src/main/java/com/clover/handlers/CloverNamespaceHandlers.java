package com.clover.handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CloverNamespaceHandlers extends NamespaceHandlerSupport {
    @Override
    public void init() {
        //初始化，一般情况下，个名空间下有多个标签，会在如让方法中为每一个标签注册一个标签解析器
        this.registerBeanDefinitionParser("annotation-driven",new CloverBeanDefinitionParser());
    }
}
