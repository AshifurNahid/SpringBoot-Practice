package com.practice.springboot.SpringBoot_Practice.AOP;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void cancelOrder(String adminId, String orderId) {
        System.out.println("Order cancelled by admin: " + adminId + ", order ID: " + orderId);
    }

    public void placeOrder(String userId, String item) {
        System.out.println("Order placed for user: " + userId + ", item: " + item);
    }
}
