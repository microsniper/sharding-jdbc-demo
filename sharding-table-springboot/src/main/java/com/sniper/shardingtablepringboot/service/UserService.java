package com.sniper.shardingtablepringboot.service;



import com.sniper.shardingtablepringboot.common.Result;
import com.sniper.shardingtablepringboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> userList();

    Result addUser();

    Result<List<User>> addAndGetList();
}
