package com.example.simpleecommerceapp.repo;

import com.example.simpleecommerceapp.entity.Order;
import com.example.simpleecommerceapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Long> {
    public List<Order> findByUser(User user);
}
