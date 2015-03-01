package org.diosoft.spring.messaging;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventsMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-events.xml");

        applicationContext.registerShutdownHook();

        Subject subject = applicationContext.getBean("subject", Subject.class);

        subject.notifyAllObservers(new Person("Ivan"));
        subject.notifyAllObservers(new Person("Igor"));

    }

}
