package com.ljheee.starter.greet;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lijianhua04 on 2019/5/16.
 */
public class GreetImpl implements Greet {

    @Autowired
    GreetProperties properties;

    @Override
    public void welcome() {
        String name = properties.getName();
        System.out.println("welcome====" + name);
    }
}
