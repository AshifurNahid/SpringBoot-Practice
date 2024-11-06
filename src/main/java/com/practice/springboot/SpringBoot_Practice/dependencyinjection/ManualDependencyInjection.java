package com.practice.springboot.SpringBoot_Practice.dependencyinjection;

class DatabaseService {
    public void connect() {
        System.out.println("Connecting to the database...");
    }
}

class UserService {
    private final DatabaseService databaseService;

    // Constructor Injection
    public UserService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void process() {
        databaseService.connect();
        System.out.println("Processing user data...");
    }
}

public class ManualDependencyInjection {
    public static void main(String[] args) {
        // Manually inject the dependency
        DatabaseService dbService = new DatabaseService();
        UserService userService = new UserService(dbService);

        userService.process();
    }
}
