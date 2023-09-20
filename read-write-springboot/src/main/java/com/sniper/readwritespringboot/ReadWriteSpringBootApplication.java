package com.sniper.readwritespringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sniper.readwritespringboot.*"})
@MapperScan(basePackages = {"com.sniper.springbootreadwrite.mapper"})
@SpringBootApplication
public class ReadWriteSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadWriteSpringBootApplication.class, args);
    }

}
