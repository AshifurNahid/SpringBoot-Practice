package com.practice.springboot.SpringBoot_Practice.dependencyinjection;

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
