package org.diosoft.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean2  {
    @Value("#{ systemProperties['user.home'] }")
    private  String value1;
    @Value("#{3+2}")
    private  String value2;

    @PostConstruct
    private void printValues(){
        System.out.println("value1 " +value1);
                System.out.println("value2 " +value2);
    }
}
