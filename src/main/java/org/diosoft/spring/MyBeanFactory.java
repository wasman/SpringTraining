package org.diosoft.spring;

public class MyBeanFactory {

    public static MyBean createMyBean() {
        return new MyBean("value1", "value2");
    }

    public MyBean createMyBeanInstance() {
        return new MyBean("value1", "value2");
    }
}
