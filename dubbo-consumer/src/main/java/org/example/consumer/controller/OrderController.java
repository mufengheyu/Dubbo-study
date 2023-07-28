package org.example.consumer.controller;


import org.example.consumer.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("order")
    public String order() {
        return orderService.getOrder("hello");
    }

}
