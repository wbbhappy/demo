package com.demof;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 启动生产者提供的服务
 */
public class provider {
    public static void main( String[] args )throws Exception {
        System.out.print(">>>>>>>>>>>>order服务启动中<<<<<<<<<<<");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/spring.xml");
        context.start();
        System.in.read();
    }
}
