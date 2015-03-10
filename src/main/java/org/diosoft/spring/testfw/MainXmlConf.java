package org.diosoft.spring.testfw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlConf {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-condition-config.xml");
        applicationContext.registerShutdownHook();

    }

}
