package com.example.serverfeign.service.impl;

import com.example.serverfeign.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
