package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.example", "com.M0000", "com.M0001","com.M0002" ,"com.M0003" ,"com.M0004" ,"com.M0099","com.Repositories"})
@EntityScan(basePackages = "com.Entities")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
