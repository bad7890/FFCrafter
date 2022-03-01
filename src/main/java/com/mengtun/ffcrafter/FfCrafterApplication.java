package com.mengtun.ffcrafter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FfCrafterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FfCrafterApplication.class, args);
    }

}
