package com.aop.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectForStudent {
    @Pointcut("execution(* com.aop.aop.services.StudentDAOImpl.*(..)) ")
    private void anyStudentService() {}

//    @AfterReturning("anyStudentService() && args(fname, sname)")
//    public void afterReturningAdvice(JoinPoint joinPoint, String fname, String sname)
//    {
//        System.out.println("After Returning method:" + joinPoint.getSignature()+"\n "
//                + "Added Student with first name - " + fname + ", second name - " + sname );
//    }

    @Around("anyStudentService() && args(fname, sname)")
    public Object beforeAdvice(ProceedingJoinPoint proceedingJoinPoint, String fname, String sname) throws Throwable {
        System.out.println("Around method:" + proceedingJoinPoint.getSignature());
        System.out.println("Before calling joint point service method");
        Object stud = proceedingJoinPoint.proceed();
        System.out.println("After calling joint point service method ");

        return stud;
    }
}
