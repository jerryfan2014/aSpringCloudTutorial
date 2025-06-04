package com.kangda.controller;

import  com.alibaba.cloud.nacos.discovery.NacosServiceDiscovery;
import  com.alibaba.nacos.api.exception.NacosException;
import com.kangda.service.ProviderService;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.cloud.client.ServiceInstance;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.client.RestTemplate;
@RestController
public  class  ConsumerController {
    @Autowired
    private  RestTemplate restTemplate;
    @Autowired
    private  NacosServiceDiscovery serviceDiscovery;
    @Autowired
    private ProviderService providerService;

    //使用openFeign访问微服务
    @GetMapping(value = "/nacos/consumer2/{str}")
    public  String getService2(@PathVariable("str") String str) {

        return providerService.getStringService(str);
    }

    //使用openFeign访问微服务
    @GetMapping(value = "/consumer/printTable")
    public  String getPrintString() {
        return providerService.getPrintString();
    }

    //使用restTemplate访问微服务（远程服务）
    @GetMapping(value = "/nacos/consumer/{str}")
    public  String getService(@PathVariable("str") String str) throws
            NacosException {
        //从Nacos中获取服务地址
        ServiceInstance serviceInstance =
                serviceDiscovery.getInstances("quickstart-provider").get(0);
        String url = serviceInstance.getHost() + ":" +
                serviceInstance.getPort();
        return  restTemplate.getForObject("http://" + url + "/nacos/service/"+
                str, String.class );
    }


}