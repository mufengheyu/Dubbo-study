package org.example.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.service.UserService;


@DubboService //todo 应注意注解
public class UserServiceImpl implements UserService {
    @Override
    public String get() {
        return " spring boot + dubbo，我跑通了哦！";
    }
}
