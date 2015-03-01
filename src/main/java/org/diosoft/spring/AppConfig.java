package org.diosoft.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Collections;

@Configuration
@PropertySource("classpath:test-config.properties")
@ComponentScan(basePackages = {"org.diosoft.spring.conditional"})
public class AppConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService(Collections.<String>emptySet());
    }
}
