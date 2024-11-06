package com.practice.springboot.SpringBoot_Practice.dependencyinjection;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
class NotificationService {

    private final MessageService messageService;
    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }

}
