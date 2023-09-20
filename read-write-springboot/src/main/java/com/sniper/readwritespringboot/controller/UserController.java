package com.sniper.readwritespringboot.controller;

import com.sniper.springbootreadwrite.common.Result;
import com.sniper.springbootreadwrite.common.ResultWrap;
import com.sniper.springbootreadwrite.entity.User;
import com.sniper.springbootreadwrite.service.UserService;
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
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/userList")
    public Result<List<User>> userList(){
        List<User> list = userService.userList();
        return ResultWrap.getSuccess(list);
    }

    @PostMapping("/addUser")
    public Result<Integer> addUser(){
        return userService.addUser();
    }

    @PostMapping("/addAndGetList")
    public Result<List<User>> addAndGetList(){
        return userService.addAndGetList();
    }
}
