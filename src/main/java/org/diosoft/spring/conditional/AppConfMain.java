package org.diosoft.spring.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
