package com.sniper.readwritespringboot.service;

import com.sniper.springbootreadwrite.common.Result;
import com.sniper.springbootreadwrite.entity.User;

import java.util.List;

public interface UserService {
    List<User> userList();

    Result addUser();

    Result<List<User>> addAndGetList();
}
