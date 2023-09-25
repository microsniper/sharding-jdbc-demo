package com.sniper.shardingdbtablereadwrite.service;




import com.sniper.shardingdbtablereadwrite.common.Result;
import com.sniper.shardingdbtablereadwrite.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> userList();

    Result<List<Order>> addOrder();

    Result<Order> findById(Long id);

    Result<List<Order>> findByName(String name);

    Result<List<Order>> addOrderBatch();
}
