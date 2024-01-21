package com.aop.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with a @Before advice

    /**
     * we can also set scope of this execution process by
     * execution, within, this, target, etc.
     * we can also set parameter
     */
    @Pointcut("execution(* com.aop.aop.services.*.*(..))")
    public void forAllDTOPackage(){}

    @Before("forAllDTOPackage()")
    public void RunBeforeAllMethods(){
        System.out.println("\n =======>>> Executing @Before Advice before all method");
    }

    @Before("execution(public void addAccount())")
    public void RunBeforeAddAccount(){
        System.out.println("\n =======>>> Executing @Before Advice before all method");
    }

    @After("execution(public void addAccount()))")
    public void afterAddAccount(){
        System.out.println("\n =====>>> Executing @After Advice on addAccount()");
    }

}
