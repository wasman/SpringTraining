package org.diosoft.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        applicationContext.registerShutdownHook();
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBeanFactory();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setInitMethodName("printApplicationName");
        beanDefinition.setBeanClass(MyBeanClass.class);
        beanDefinition.setLazyInit(false);
        beanDefinition.setAbstract(false);
        beanDefinition.setAutowireCandidate(true);
        beanDefinition.setScope("prototype");
        beanFactory.registerBeanDefinition("myBeanAddWithDef", beanDefinition);

        MyBeanClass myBeanAddWithDef1 = applicationContext.getBean("myBeanAddWithDef", MyBeanClass.class);
        myBeanAddWithDef1.printApplicationName();

        MyBeanClass myBeanAddWithDef2 = applicationContext.getBean("myBeanAddWithDef", MyBeanClass.class);
        myBeanAddWithDef2.printApplicationName();
    }

}
