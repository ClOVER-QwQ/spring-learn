package com.clover.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration//证明是配置文件
@ComponentScan("com.clover")//bean注解扫描
@EnableAspectJAutoProxy
public class SpringConfig {

}
