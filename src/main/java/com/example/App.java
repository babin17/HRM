package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude= { DataSourceAutoConfiguration.class })
@ComponentScan({"com.example.hrmgmt.UserRepository"})
@EnableJpaRepositories("com.example.hrmgmt.UserRepository")

public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
