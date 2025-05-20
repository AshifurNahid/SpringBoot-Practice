package com.practice.springboot.SpringBoot_Practice.AOP;

import com.practice.springboot.SpringBoot_Practice.AOP.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/placeOrder")
    public String placeOrder(@RequestParam String userId, @RequestParam String item) {
        orderService.placeOrder(userId, item);
        return "Order placed successfully!";
    }

    @GetMapping("/cancelOrder")
    public String cancelOrder(@RequestParam String adminId, @RequestParam String orderId) {
        orderService.cancelOrder(adminId, orderId);
        return "Order cancelled successfully!";
    }
}
