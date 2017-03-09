package com.recive.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    private static ApplicationContext ctx;

    public static void main(String[] args) {
        ctx = new ClassPathXmlApplicationContext("config/spring-common.xml");
        Object userMapper = ctx.getBean("userMapper");
        System.out.println(userMapper);
    }
}
