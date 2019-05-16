package com.ljheee.starter.demo;

import com.ljheee.starter.log.annotation.MethodExecuteLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {


    @Resource
    HelloService helloService;

    // 测试方法拦截器
    @Test
    public void contextLoads() {
        String kkk = helloService.hi("kkk");
        System.out.println(kkk);
    }


}
