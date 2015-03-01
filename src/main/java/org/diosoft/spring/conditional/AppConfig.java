package org.diosoft.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"org.diosoft.spring.conditional"})
public class AppConfig {

    @Bean
    public MyBean helloService() {
        return new MyBean();
    }

//    @Bean
//    public PropertySourcesPlaceholderConfigurer getProperties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
