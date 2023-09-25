package com.sniper.shardingdbtablespringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sniper.shardingdbtablespringboot.*"})
@MapperScan(basePackages = {"com.sniper.shardingdbtablespringboot.mapper"})
@SpringBootApplication
public class ShardingdbTableSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingdbTableSpringBootApplication.class, args);
    }

}
