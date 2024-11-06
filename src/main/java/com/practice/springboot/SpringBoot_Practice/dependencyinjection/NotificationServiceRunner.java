package com.practice.springboot.SpringBoot_Practice.dependencyinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceRunner implements CommandLineRunner {
    private final NotificationService notificationService;

    private NotificationServiceRunner(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void run(String... args) throws Exception {
        notificationService.notifyUser("Your transaction is successful.");
    }

}
