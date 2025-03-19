package com.alert.asteroid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AsteroidNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsteroidNotificationApplication.class, args);
    }

}
