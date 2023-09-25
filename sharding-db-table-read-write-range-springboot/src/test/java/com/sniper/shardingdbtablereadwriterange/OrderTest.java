package com.sniper.shardingdbtablereadwriterange;

import com.alibaba.fastjson.JSON;
import com.sniper.shardingdbtablereadwriterange.common.Result;
import com.sniper.shardingdbtablereadwriterange.controller.OrderController;
import com.sniper.shardingdbtablereadwriterange.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/20 6:09 PM
 **/
@SpringBootTest(classes = ShardingDBTableReadWriteRangeSpringBootApplication.class)
public class OrderTest {

    @Resource
    private OrderController orderController;

    @Test
    public void addOrderTest(){
        Result<List<Order>> result = orderController.addOrder();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void addOrderBatchTest(){
        Result<List<Order>> listResult = orderController.addOrderBatch();
        System.out.println(listResult);
    }

    @Test
    public void orderListTest(){
        Result<List<Order>> listResult = orderController.orderList();
        System.out.println(JSON.toJSONString(listResult));
    }

    @Test
    public void findByIdTest(){
        Result<Order> result = orderController.findById(new Long("913035667594805248"));
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void findByNameTest(){
        Result<List<Order>> result = orderController.findByName("雪碧");
        System.out.println(JSON.toJSONString(result));
    }
}
