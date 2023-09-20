package com.sniper.shardingtablepringboot.controller;

import com.sniper.shardingtablepringboot.common.Result;
import com.sniper.shardingtablepringboot.common.ResultWrap;
import com.sniper.shardingtablepringboot.entity.Order;
import com.sniper.shardingtablepringboot.service.OrderService;
import org.springframework.web.bind.annotation.*;

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
    public Result<Integer> addOrder(){
        return orderService.addOrder();
    }

    @GetMapping("/order")
    public Result<Order> findById(Integer id) {
        return orderService.findById(id);
    }

    @GetMapping("/name")
    public Result<List<Order>> findByName(String name){
        return orderService.findByName(name);
    }

}
