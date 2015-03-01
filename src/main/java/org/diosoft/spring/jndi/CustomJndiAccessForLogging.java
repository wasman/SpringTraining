package org.diosoft.spring.jndi;

import org.springframework.jndi.JndiCallback;

import javax.naming.Context;
import javax.naming.NamingException;

public class CustomJndiAccessForLogging implements JndiCallback {

    private String key;

    public CustomJndiAccessForLogging(String key) {
        this.key = key;
    }

    public Object doInContext(Context context) throws NamingException {
        System.out.println("Start lookup operation");
        Object value = context.lookup(key);
        System.out.println("End lookup operation");
        return value;
    }
}
