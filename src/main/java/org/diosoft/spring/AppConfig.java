package org.diosoft.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService(Collections.<String>emptySet());
    }
}
