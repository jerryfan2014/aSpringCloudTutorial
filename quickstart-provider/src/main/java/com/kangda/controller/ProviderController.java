package com.kangda.controller;

import  org.springframework.beans.factory.annotation.Value;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.RestController;
@RestController
public  class  ProviderController {
    @Value("${spring.application.name}")
    private  String appName;
    @Value("${server.port}")
    private  String serverPort;
    @GetMapping(value = "/nacos/service/{str}")
    public  String getNacosService(@PathVariable("str") String str) {
        return  "<h2>服务访问成功！</h2>服务名称："+appName+"， 端口号："
                + serverPort +"<br /> 传入的参数：" + str;
    }
}
