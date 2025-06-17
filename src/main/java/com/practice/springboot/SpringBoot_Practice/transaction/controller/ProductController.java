package com.practice.springboot.SpringBoot_Practice.transaction.controller;

import com.practice.springboot.SpringBoot_Practice.transaction.entity.Product;
import com.practice.springboot.SpringBoot_Practice.transaction.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/products")
public class ProductController {


    private final ProductService productService;


     @GetMapping
     public List<Product> getAllProducts() {
         return productService.getAllProducts();
     }

     @PostMapping
     public Product createProduct(@RequestBody Product product) {
         return productService.createProduct(product);
     }


}
