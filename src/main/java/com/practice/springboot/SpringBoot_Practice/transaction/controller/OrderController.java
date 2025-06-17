package com.practice.springboot.SpringBoot_Practice.transaction.controller;

import com.practice.springboot.SpringBoot_Practice.transaction.entity.Order;
import com.practice.springboot.SpringBoot_Practice.transaction.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public String createOrder(@RequestBody Order order) {

        orderService.saveOrder(order);
        return "Order created successfully";
    }


}
