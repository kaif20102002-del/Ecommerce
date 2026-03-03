package com.example.simpleecommerceapp.repo;

import com.example.simpleecommerceapp.entity.Admin;
import com.example.simpleecommerceapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
    public Product findByName(String name);
}
