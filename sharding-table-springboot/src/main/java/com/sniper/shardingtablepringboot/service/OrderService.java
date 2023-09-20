package com.sniper.shardingtablepringboot.service;



import com.sniper.shardingtablepringboot.common.Result;
import com.sniper.shardingtablepringboot.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> userList();

    Result addOrder();

    Result<Order> findById(Integer id);

    Result<List<Order>> findByName(String name);
}
