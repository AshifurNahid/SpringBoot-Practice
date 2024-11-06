package com.practice.springboot.SpringBoot_Practice.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
