package com.ljheee.starter.greet;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 */
@ConfigurationProperties(prefix = "spring.greet")
public class GreetProperties {

    private String name = "ljheee";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
