package com.ljheee.starter.demo;

import com.ljheee.starter.greet.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lijianhua04 on 2019/5/12.
 */
@ComponentScan
@SpringBootApplication
public class App  implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }


    @Autowired
    Greet greet;

    @Override
    public void run(String... args) throws Exception {
        greet.welcome();
    }
}
