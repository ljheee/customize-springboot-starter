package com.ljheee.starter.greet;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
    @ConditionalOnProperty(prefix = "spring.greet", name = "name", havingValue = "Jack Lee")// 配置文件 spring.greet.name=Jack Lee时才创建bean；精准匹配，可以使框架精准创建不同的bean
    public Greet greet() {
        return new GreetImpl();
    }

}
