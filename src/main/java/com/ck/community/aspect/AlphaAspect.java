package com.ck.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class AlphaAspect {

    @Pointcut("execution(* com.ck.community.service.*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        System.out.println("before pointcut");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after pointcut");
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("afterReturning pointcut");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing pointcut");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around before");
        Object obj = joinPoint.proceed();
        System.out.println("around after");
        return obj;
    }

}
