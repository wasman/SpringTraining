package org.diosoft.spring.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBeanClient {

    @Autowired
    @Qualifier("secondBean")
    @BeanXL
    private CommonBean bean;

    @PostConstruct
    private void init(){
        System.out.println(bean.getClass());
    }

}
