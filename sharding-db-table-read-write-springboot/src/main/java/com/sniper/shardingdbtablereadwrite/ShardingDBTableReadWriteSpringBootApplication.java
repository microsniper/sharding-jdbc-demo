package com.sniper.shardingdbtablereadwrite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sniper.shardingdbtablereadwrite.*"})
@MapperScan(basePackages = {"com.sniper.shardingdbtablereadwrite.mapper"})
@SpringBootApplication
public class ShardingDBTableReadWriteSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDBTableReadWriteSpringBootApplication.class, args);
    }

}
