package org.diosoft.spring;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.beans.factory.access.SingletonBeanFactoryLocator;

public class GetContextRefWIthBeanFactoryLocatorDuplicate {

    public static void main(String[] args) {
        callContext("first");
        callContext("second");
    }

    private static void callContext(String call) {
        BeanFactoryLocator bfl = SingletonBeanFactoryLocator.getInstance("beanRefFactoryAlias");
        BeanFactoryReference bf = bfl.useBeanFactory("mainContextAlias");

        HelloService someService = (HelloService) bf.getFactory().getBean("helloService");
        someService.sayHello(call);
    }
}
