package com.ljheee.starter.log.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义 方法拦截器
 */
public class MethodLogAdvice implements MethodInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(MethodLogAdvice.class);


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        long begin = System.currentTimeMillis();
        Object result = invocation.proceed();//真实业务
        long end = System.currentTimeMillis();

        logger.info("Method log from interceptor:{}-{}, used Times={} -ms",
                invocation.getMethod().getDeclaringClass(),
                invocation.getMethod().getName(),
                (end - begin));
        return result;
    }
}
