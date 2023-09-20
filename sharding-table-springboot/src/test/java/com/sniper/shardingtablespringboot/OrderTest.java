package com.sniper.shardingtablespringboot;

import com.alibaba.fastjson.JSON;
import com.sniper.shardingtablepringboot.ShardingTableSpringBootApplication;
import com.sniper.shardingtablepringboot.common.Result;
import com.sniper.shardingtablepringboot.controller.OrderController;
import com.sniper.shardingtablepringboot.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/20 3:40 PM
 **/
@SpringBootTest(classes = ShardingTableSpringBootApplication.class)
public class OrderTest {

    @Resource
    private OrderController orderController;

    @Test
    public void addOrderTest(){
        Result<Integer> integerResult = orderController.addOrder();
    }

    @Test
    public void orderListTest(){
        Result<List<Order>> listResult = orderController.orderList();
        System.out.println(JSON.toJSONString(listResult));
    }

    @Test
    public void findByIdTest(){
        Result<Order> result = orderController.findById(5);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void findByNameTest(){
        Result<List<Order>> result = orderController.findByName("雪碧");
        System.out.println(JSON.toJSONString(result));
    }
}
