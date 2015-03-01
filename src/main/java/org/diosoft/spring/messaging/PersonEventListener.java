package org.diosoft.spring.messaging;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationListener;

public class PersonEventListener implements ApplicationListener<PersonEvent>, BeanNameAware {

    private String name;

    @Override
    public void onApplicationEvent(PersonEvent event) {
        System.out.println("We got an Event with person " + event.getSource() + " for Listener " + name);
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
