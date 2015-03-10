package org.diosoft.spring.conditional;

import org.springframework.context.annotation.Conditional;

@Conditional(PropertyCondition.class)
public class BeanForDevEnabledEnvironment {

    public BeanForDevEnabledEnvironment() {
        System.out.println("BeanForDevEnabledEnvironment created ");
    }
}
