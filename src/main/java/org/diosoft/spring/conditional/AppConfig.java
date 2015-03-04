package org.diosoft.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("classpath:spring-training.properties")
public class AppConfig {

    @Bean(name = "myBean")
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean(name = "myBean2")
    @Primary
    public MyBean2 myBean2() {
        return new MyBean2();
    }

    @Bean(name = "beanForDevEnabledEnvironment")
    @Profile("dev")
    @Conditional(PropertyCondition.class)
    public BeanForDevEnabledEnvironment beanForDevEnabledEnvironment() {
        return new BeanForDevEnabledEnvironment();
    }

}
