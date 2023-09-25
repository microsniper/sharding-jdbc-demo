package com.sniper.shardingdbtablereadwrite.service.impl;

import com.sniper.shardingdbtablereadwrite.common.Result;
import com.sniper.shardingdbtablereadwrite.common.ResultWrap;
import com.sniper.shardingdbtablereadwrite.entity.Order;
import com.sniper.shardingdbtablereadwrite.mapper.OrderMapper;
import com.sniper.shardingdbtablereadwrite.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/19 3:26 PM
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Override
    public List<Order> userList() {
        List<Order> list = orderMapper.selectList();
        return list;
    }

    @Override
    public Result<List<Order>> addOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = Order.builder()
                    .orderNo(new Random().nextInt(1000)+i+"")
                    .goodsName("分库分表")
                    .build();
            orderMapper.insert(order);
        }
        List<Order> orderlist = orderMapper.findByName("分库分表");
        return ResultWrap.getSuccess(orderlist);
    }

    @Override
    public Result<Order> findById(Long id) {
        Order order = orderMapper.findById(id);
        return ResultWrap.getSuccess(order);
    }

    @Override
    public Result<List<Order>> findByName(String name) {
        List<Order> list =  orderMapper.findByName(name);
        return ResultWrap.getSuccess(list);
    }

    @Override
    public Result<List<Order>> addOrderBatch() {
        List<Order> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Order order = Order.builder()
                    .orderNo(new Random().nextInt(1000)+i+"")
                    .goodsName("修改分表数量为3")
                    .build();
            list.add(order);
        }
        orderMapper.insertBatch(list);
        List<Order> orderlist = orderMapper.findByName("修改分表数量为3");
        return ResultWrap.getSuccess(orderlist);
    }

}
