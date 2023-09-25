package com.sniper.shardingdbtablespringboot.controller;

import com.sniper.shardingdbtablespringboot.common.Result;
import com.sniper.shardingdbtablespringboot.common.ResultWrap;
import com.sniper.shardingdbtablespringboot.entity.Order;
import com.sniper.shardingdbtablespringboot.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/19 3:25 PM
 **/
@RequestMapping("/order")
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/orderList")
    public Result<List<Order>> orderList(){
        List<Order> list = orderService.userList();
        return ResultWrap.getSuccess(list);
    }

    @PostMapping("/addOrder")
    public Result<List<Order>> addOrder(){
        return orderService.addOrder();
    }

    @GetMapping("/order")
    public Result<Order> findById(Long id) {
        return orderService.findById(id);
    }

    @GetMapping("/name")
    public Result<List<Order>> findByName(String name){
        return orderService.findByName(name);
    }

}
