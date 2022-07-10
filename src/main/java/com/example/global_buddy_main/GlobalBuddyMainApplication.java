package com.example.global_buddy_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GlobalBuddyMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalBuddyMainApplication.class, args);
    }

}
