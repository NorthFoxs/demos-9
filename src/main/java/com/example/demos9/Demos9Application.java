package com.example.demos9;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demos9.mapper")
public class Demos9Application {

    public static void main(String[] args) {
        SpringApplication.run(Demos9Application.class, args);
    }

}
