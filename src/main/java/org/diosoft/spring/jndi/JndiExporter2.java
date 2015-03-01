package org.diosoft.spring.jndi;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.jndi.JndiTemplate;

import java.util.Map;

public class JndiExporter2 implements InitializingBean {

    private final JndiTemplate template = new JndiTemplate();

    private Map<String, Object> jndiMapping = null;

    @Override
    public void afterPropertiesSet() throws Exception {
            for(Map.Entry<String, Object> addToJndi: jndiMapping.entrySet()){
                    template.bind(addToJndi.getKey(), addToJndi.getValue());
            }
    }

    public void setJndiMapping(Map<String, Object> jndiMapping) {
            this.jndiMapping = jndiMapping;
    }

}
