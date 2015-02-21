package org.diosoft.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainXmlConf {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.registerShutdownHook();
        String[] aliases = applicationContext.getAliases("helloService");
        System.out.println("All aliases" + Arrays.toString(aliases));
        Object serviceAlias = applicationContext.getBean("helloServiceAlias1");
        System.out.printf("Actual class " + serviceAlias.getClass().getName());
    }

}
