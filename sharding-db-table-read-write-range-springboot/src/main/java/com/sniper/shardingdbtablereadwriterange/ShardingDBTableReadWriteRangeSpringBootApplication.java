package com.sniper.shardingdbtablereadwriterange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sniper.shardingdbtablereadwriterange.*"})
@MapperScan(basePackages = {"com.sniper.shardingdbtablereadwriterange.mapper"})
@SpringBootApplication
public class ShardingDBTableReadWriteRangeSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDBTableReadWriteRangeSpringBootApplication.class, args);
    }

}
