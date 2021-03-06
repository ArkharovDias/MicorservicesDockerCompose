package ru.itis.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan("ru.itis.service")
@SpringBootApplication
public class FirstServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServiceApplication.class, args);
    }

}
