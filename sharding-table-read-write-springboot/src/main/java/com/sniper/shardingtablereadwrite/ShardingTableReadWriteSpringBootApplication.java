package com.sniper.shardingtablereadwrite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sniper.shardingtablereadwrite.*"})
@MapperScan(basePackages = {"com.sniper.shardingtablereadwrite.mapper"})
@SpringBootApplication
public class ShardingTableReadWriteSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingTableReadWriteSpringBootApplication.class, args);
    }

}
