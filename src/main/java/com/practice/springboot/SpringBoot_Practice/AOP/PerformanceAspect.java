package com.practice.springboot.SpringBoot_Practice.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* com.practice.springboot.SpringBoot_Practice.AOP.OrderService.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
           long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // Proceed with the method call
        long duration = System.currentTimeMillis() - start;
        System.out.println("Method " + joinPoint.getSignature().getName() + " executed in " + duration + " ms");
        return result;
    }
}
