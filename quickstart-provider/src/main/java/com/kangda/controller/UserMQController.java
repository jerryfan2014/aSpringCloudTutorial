package com.kangda.controller;


import com.kangda.User;
import com.kangda.service.UserMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMQController {

    @Autowired
    private UserMQService userMQService;

    @PostMapping("/mq/sendUser")
    public String sendUserMessage(User user) {
        userMQService.sendUser(user);
        return "User sent!";
    }
}
