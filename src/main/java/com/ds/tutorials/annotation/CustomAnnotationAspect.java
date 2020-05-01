package com.ds.tutorials.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomAnnotationAspect {

    @Around("@annotation(CustomAnnotation)")
    public Object LoggedInBy(ProceedingJoinPoint joinPoint) throws Throwable {
       System.out.println("Custom Annotation >>>> @Around");
        return joinPoint.proceed();
    }

   /* @Before("@annotation(CustomAnnotation)")
    public void before(Pointcut pointcut){
        System.out.println("Custom Annotation >>>> @Before");
    }*/


    @After("@annotation(CustomAnnotation)")
    public Object after(ProceedingJoinPoint joinPoint) throws  Throwable{
        System.out.println("Custom Annotation >>>> @After");
        return joinPoint.proceed();
    }

}
