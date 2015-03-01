package org.diosoft.spring.jndi;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

import java.util.Map;

public class JndiExporter implements InitializingBean {

    private final SimpleNamingContextBuilder contextBuilder = new SimpleNamingContextBuilder();

    private Map<String, Object> jndiMapping = null;

    @Override
    public void afterPropertiesSet() throws Exception {
        for (Map.Entry<String, Object> addToJndi : jndiMapping.entrySet()) {
            contextBuilder.bind(addToJndi.getKey(), addToJndi.getValue());
        }

        contextBuilder.activate();
    }

    public void setJndiMapping(Map<String, Object> jndiMapping) {
        this.jndiMapping = jndiMapping;
    }

}