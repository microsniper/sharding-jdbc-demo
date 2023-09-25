package com.sniper.shardingdbtablereadwriterange.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/19 3:31 PM
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;

    private String orderNo;

    private String goodsName;

}
