package com.sniper.readwritespringboot;

import com.sniper.readwritespringboot.common.Result;
import com.sniper.readwritespringboot.controller.UserController;
import com.sniper.readwritespringboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/19 4:33 PM
 **/
@SpringBootTest
public class UserTest {

    @Resource
    UserController userController;
    @Test
    public void userListTest(){
        Result<List<User>> listResult = userController.userList();
        System.out.println(listResult);
    }

    @Test
    public void addUser(){
        Result<Integer> integerResult = userController.addUser();
        System.out.println(integerResult);
    }

    @Test
    public void addAndGetList(){
        Result<List<User>> listResult = userController.addAndGetList();
        System.out.println(listResult);
    }
}
