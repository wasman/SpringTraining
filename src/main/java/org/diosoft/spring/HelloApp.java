package org.diosoft.spring;

import org.diosoft.spring.forscan.HelloService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.scan("org.diosoft.spring.forscan");
        HelloService helloService = context.getBean(HelloService.class);
        HelloService2 helloService2 = context.getBean(HelloService2.class);
        System.out.println(helloService.sayHello());
        System.out.println(helloService2.sayHello());
    }
}
