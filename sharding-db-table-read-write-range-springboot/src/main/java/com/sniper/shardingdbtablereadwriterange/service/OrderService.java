package com.sniper.shardingdbtablereadwriterange.service;




import com.sniper.shardingdbtablereadwriterange.common.Result;
import com.sniper.shardingdbtablereadwriterange.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> userList();

    Result<List<Order>> addOrder();

    Result<Order> findById(Long id);

    Result<List<Order>> findByName(String name);

    Result<List<Order>> addOrderBatch();
}
