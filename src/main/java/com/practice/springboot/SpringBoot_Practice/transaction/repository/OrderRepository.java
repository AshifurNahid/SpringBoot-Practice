package com.practice.springboot.SpringBoot_Practice.transaction.repository;

import com.practice.springboot.SpringBoot_Practice.transaction.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
