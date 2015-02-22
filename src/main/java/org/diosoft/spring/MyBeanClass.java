package org.diosoft.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBeanClass implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;
    private String name;

    public MyBeanClass() {
        System.out.println("MyBeanClass initialized");

    }

    public void printApplicationName() {
        System.out.println("Bean name " + name );
        System.out.println("Current Bean toString " + this.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
