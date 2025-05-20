package com.practice.springboot.SpringBoot_Practice.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.practice.springboot.SpringBoot_Practice.AOP.OrderService.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        System.out.println("Method called: " + joinPoint.getSignature().getName());
        System.out.println("Arguments: " + java.util.Arrays.toString(joinPoint.getArgs()));
    }
}
