package com.sniper.shardingdbtablereadwrite.mapper;

import com.sniper.shardingdbtablereadwrite.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> selectList();

    int insert(Order order);

    Order findById(Long id);

    List<Order> findByName(String name);

    int insertBatch(List<Order> list);
}
