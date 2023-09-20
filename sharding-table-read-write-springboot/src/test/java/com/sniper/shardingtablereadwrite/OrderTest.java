package com.sniper.shardingtablereadwrite;

import com.alibaba.fastjson.JSON;
import com.sniper.shardingtablereadwrite.common.Result;
import com.sniper.shardingtablereadwrite.controller.OrderController;
import com.sniper.shardingtablereadwrite.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/20 6:09 PM
 **/
@SpringBootTest(classes = ShardingTableReadWriteSpringBootApplication.class)
public class OrderTest {

    @Resource
    private OrderController orderController;

    @Test
    public void addOrderTest(){
        Result<List<Order>> result = orderController.addOrder();
        System.out.println(JSON.toJSONString(result));
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
