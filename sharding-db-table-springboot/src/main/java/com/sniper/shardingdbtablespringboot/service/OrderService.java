package com.sniper.shardingdbtablespringboot.service;




import com.sniper.shardingdbtablespringboot.common.Result;
import com.sniper.shardingdbtablespringboot.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> userList();

    Result<List<Order>> addOrder();

    Result<Order> findById(Long id);

    Result<List<Order>> findByName(String name);
}
