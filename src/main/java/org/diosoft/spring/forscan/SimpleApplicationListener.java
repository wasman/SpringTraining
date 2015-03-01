package org.diosoft.spring.forscan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

//@Component
public class SimpleApplicationListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Event occured " + event);

    }
}
