package com.example.webserver;

import com.example.webserver.mapper.TrackMapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackageClasses = TrackMapper.class)
@ComponentScan(basePackages = "com.example")
public class WebserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebserverApplication.class, args);
    }
}
