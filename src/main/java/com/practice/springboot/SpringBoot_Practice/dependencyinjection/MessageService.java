package com.practice.springboot.SpringBoot_Practice.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
interface MessageService {
    void sendMessage(String message);
}
