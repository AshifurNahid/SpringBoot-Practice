package com.practice.springboot.SpringBoot_Practice.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    // Pointcut targets only the cancelOrder method
    @Before("execution(* com.practice.springboot.SpringBoot_Practice.AOP.OrderService.cancelOrder(..)) && args(adminId, ..)")
    public void checkAdminPrivileges(String adminId) {
        // Dummy security logic: Only admins with ID "admin123" can cancel orders
        if (!"admin123".equals(adminId)) {
            throw new SecurityException("Access denied for user: " + adminId);
        }
    }
}
