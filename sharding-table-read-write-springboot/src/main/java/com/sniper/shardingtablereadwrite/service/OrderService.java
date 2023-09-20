package com.sniper.shardingtablereadwrite.service;




import com.sniper.shardingtablereadwrite.common.Result;
import com.sniper.shardingtablereadwrite.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> userList();

    Result<List<Order>> addOrder();

    Result<Order> findById(Integer id);

    Result<List<Order>> findByName(String name);
}
