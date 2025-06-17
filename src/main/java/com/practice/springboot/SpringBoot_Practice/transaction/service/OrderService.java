package com.practice.springboot.SpringBoot_Practice.transaction.service;

import com.practice.springboot.SpringBoot_Practice.transaction.entity.Order;
import com.practice.springboot.SpringBoot_Practice.transaction.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductService productService;

    ///  If we donot use @Transactional, the order may place successfully,
    /// but the stock update may fail, leading to inconsistency.
    @Transactional
    public void saveOrder(Order order) {
        orderRepository.save(order);
        productService.updateStock(order.getProductId(), -order.getQuantity());
        System.out.println("Order saved for product ID: " +
                order.getProductId() + " with quantity: " + order.getQuantity());

    }

}
