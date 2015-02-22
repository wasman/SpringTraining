package org.diosoft.spring;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;

public class GetContextRefWIthContextBeanFactoryLocator {

    public static void main(String[] args) {
        BeanFactoryLocator bfl = ContextSingletonBeanFactoryLocator.getInstance();
        BeanFactoryReference bf = bfl.useBeanFactory("mainContext");

        HelloService someService = (HelloService) bf.getFactory().getBean("helloService");
        someService.sayHello("second");
    }
}
