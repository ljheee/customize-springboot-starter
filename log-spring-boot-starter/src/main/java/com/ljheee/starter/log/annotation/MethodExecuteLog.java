package com.ljheee.starter.log.annotation;

import java.lang.annotation.*;

/**
 * 该注解 作用在方法上
 * 即可实现 方法执行时间日志记录
 */
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodExecuteLog {
}
