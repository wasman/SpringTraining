package org.diosoft.spring;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.beans.factory.access.SingletonBeanFactoryLocator;

public class GetContextRefWIthBeanFactoryLocator {

    public static void main(String[] args) {
        BeanFactoryLocator bfl = SingletonBeanFactoryLocator.getInstance();
        BeanFactoryReference bf = bfl.useBeanFactory("mainContext");
//        HelloService someService = (HelloService) bf.getFactory().getBean("helloService");
//        someService.sayHello("first");
    }
}
