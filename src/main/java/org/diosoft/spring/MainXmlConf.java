package org.diosoft.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlConf {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.registerShutdownHook();
    }

}
