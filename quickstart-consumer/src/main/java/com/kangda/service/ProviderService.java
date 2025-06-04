package com.kangda.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="quickstart-provider")
public interface ProviderService {

    @GetMapping(value = "/nacos/service/{str}")
    public  String getStringService(@PathVariable("str") String str) ;

    @GetMapping("/printTable")
    public String getPrintString();


//    @GetMapping("/provider/userInfo")
//    public User getUserInfo();
}
