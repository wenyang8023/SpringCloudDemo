package com.example.serverfeign.controller;

import com.example.serverfeign.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return demoService.sayHiFromClientOne( name );
    }

}
