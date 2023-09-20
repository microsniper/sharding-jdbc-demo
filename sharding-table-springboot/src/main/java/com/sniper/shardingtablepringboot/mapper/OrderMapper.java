package com.sniper.shardingtablepringboot.mapper;

import com.sniper.shardingtablepringboot.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> selectList();

    int insert(Order order);

    Order findById(Integer id);

    List<Order> findByName(String name);
}
