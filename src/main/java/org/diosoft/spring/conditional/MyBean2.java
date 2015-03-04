package org.diosoft.spring.conditional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("secondBean")
@BeanXL
public class MyBean2 implements CommonBean {

}
