package org.diosoft.spring.conditional;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class HelloService {

    @Value("${enable.dev}")
    private String enableDev;

    public HelloService() {
        System.out.println("> BeanForDevEnabledEnvironment created " + enableDev);
    }

    @PostConstruct
    private void init() {
        System.out.println("Post construct " + enableDev);
    }
}
