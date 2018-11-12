package com.example.eurekaclint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClintApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClintApplication.class, args);
	}

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "ketty") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
