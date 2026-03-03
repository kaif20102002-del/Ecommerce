package com.example.simpleecommerceapp.controller;

import com.example.simpleecommerceapp.entity.Order;
import com.example.simpleecommerceapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

}
