package com.sniper.shardingtablereadwrite.service.impl;

import com.sniper.shardingtablereadwrite.common.Result;
import com.sniper.shardingtablereadwrite.common.ResultWrap;
import com.sniper.shardingtablereadwrite.entity.Order;
import com.sniper.shardingtablereadwrite.mapper.OrderMapper;
import com.sniper.shardingtablereadwrite.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        for (int i = 10; i < 20; i++) {
            Order order = Order.builder()
                    .id(i)
                    .orderNo(new Random(100).nextInt()+i+"")
                    .goodsName("雪花")
                    .build();
            orderMapper.insert(order);
        }
        List<Order> orderlist = orderMapper.findByName("雪花");
        return ResultWrap.getSuccess(orderlist);
    }

    @Override
    public Result<Order> findById(Integer id) {
        Order order = orderMapper.findById(id);
        return ResultWrap.getSuccess(order);
    }

    @Override
    public Result<List<Order>> findByName(String name) {
        List<Order> list =  orderMapper.findByName(name);
        return ResultWrap.getSuccess(list);
    }

}
