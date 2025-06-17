package com.kangda.service;

import com.kangda.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class UserMQService {

    @Autowired
    private StreamBridge streamBridge;

    public void sendUser(User user) {
        streamBridge.send("orderOutput", user);
    }
}
