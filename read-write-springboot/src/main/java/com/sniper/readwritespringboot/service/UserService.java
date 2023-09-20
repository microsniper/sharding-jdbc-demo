package com.sniper.readwritespringboot.service;


import com.sniper.readwritespringboot.common.Result;
import com.sniper.readwritespringboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> userList();

    Result addUser();

    Result<List<User>> addAndGetList();
}
