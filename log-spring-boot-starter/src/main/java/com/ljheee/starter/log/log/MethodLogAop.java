package com.ljheee.starter.log.log;

import com.ljheee.starter.log.annotation.MethodExecuteLog;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lijianhua04 on 2018/10/21.
 */
@Configuration
@ConditionalOnClass(value = SpringBootApplication.class)
public class MethodLogAop extends AbstractPointcutAdvisor implements InitializingBean {

    private Pointcut pointcut;
    private Advice advice;

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        this.pointcut = new AnnotationMatchingPointcut(null, MethodExecuteLog.class);
        this.advice = new MethodLogAdvice();
    }
}
