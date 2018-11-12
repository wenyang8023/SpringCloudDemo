package com.example.serviceribbon.service.impl;

import com.example.serviceribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-clint/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi:" + name + ",sorry,Error!";
    }
}
