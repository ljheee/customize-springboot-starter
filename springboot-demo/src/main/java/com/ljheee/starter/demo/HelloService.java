package com.ljheee.starter.demo;

import com.ljheee.starter.log.annotation.MethodExecuteLog;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    @MethodExecuteLog
    public String hi(String name){
        return "hi="+name;
    }


}
