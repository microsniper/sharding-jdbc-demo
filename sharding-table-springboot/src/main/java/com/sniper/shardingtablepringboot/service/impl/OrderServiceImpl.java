package com.sniper.shardingtablepringboot.service.impl;

import com.sniper.shardingtablepringboot.common.Result;
import com.sniper.shardingtablepringboot.common.ResultWrap;
import com.sniper.shardingtablepringboot.entity.Order;
import com.sniper.shardingtablepringboot.mapper.OrderMapper;
import com.sniper.shardingtablepringboot.service.OrderService;
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
    public Result<Object> addOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = Order.builder()
                    .id(i)
                    .orderNo(new Random(100).nextInt()+i+"")
                    .goodsName("可乐")
                    .build();
            orderMapper.insert(order);
        }
        return ResultWrap.getSuccess();
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
