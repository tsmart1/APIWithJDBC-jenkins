package com.sparta.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiWithJdbcApplication {

    public static void main(String[] args) {
        WorldDAO.connectToDb();
        SpringApplication.run(ApiWithJdbcApplication.class, args);
    }

}
