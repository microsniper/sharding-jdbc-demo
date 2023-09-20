package com.sniper.shardingtablepringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sniper.shardingtablepringboot.*"})
@MapperScan(basePackages = {"com.sniper.shardingtablepringboot.mapper"})
@SpringBootApplication
public class ShardingTableSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingTableSpringBootApplication.class, args);
    }

}
