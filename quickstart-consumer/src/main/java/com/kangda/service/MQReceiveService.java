package com.kangda.service;

import com.kangda.User;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class MQReceiveService {

    public Consumer<User> orderInput() {
        return user -> {
            System.out.println("接受消息为：" + user);
        };
    }
}
