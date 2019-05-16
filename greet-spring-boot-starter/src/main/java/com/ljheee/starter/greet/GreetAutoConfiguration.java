package com.ljheee.starter.greet;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lijianhua04 on 2019/5/16.
 */
@Configuration
@ConditionalOnClass(Greet.class)
@EnableConfigurationProperties(GreetProperties.class)
public class GreetAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public Greet greet(){
        return new GreetImpl();
    }

}
