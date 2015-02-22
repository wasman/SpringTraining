package org.diosoft.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceToMainXmlConf {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanRefFactory.xml");
        applicationContext.registerShutdownHook();

    }

}
