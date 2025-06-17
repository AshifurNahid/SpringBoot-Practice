package com.practice.springboot.SpringBoot_Practice.transaction.service;

import com.practice.springboot.SpringBoot_Practice.transaction.entity.Product;
import com.practice.springboot.SpringBoot_Practice.transaction.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;
    public void updateStock(Long productId, Integer quantity) {
        Integer currentStock = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"))
                .getStock();
        if (currentStock + quantity < 25) {
            throw new RuntimeException("Insufficient stock for product ID: " + productId);
        }
        productRepository.findById(productId)
                .ifPresent(product -> {
                    product.setStock(currentStock + quantity);
                    productRepository.save(product);
                });
        System.out.println("Stock updated for product ID: " + productId + " with quantity: " + quantity);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
