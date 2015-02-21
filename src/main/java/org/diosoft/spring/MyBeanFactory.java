package org.diosoft.spring;

public class MyBeanFactory {

    public static MyBean createMyBean() {
        return new MyBean();
    }

    public MyBean createMyBeanInstance() {
        return new MyBean();
    }
}
