package org.example.consumer.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.consumer.service.OrderService;
import org.example.service.UserService;
import org.springframework.stereotype.Service;


@Service // todo
public class OrderServiceImpl implements OrderService {

    @DubboReference // todo
    private UserService userService;

    @Override
    public String getOrder(String name) {
        return name + userService.get();
    }
}
