package com.sniper.readwritespringboot.service.impl;

import com.sniper.readwritespringboot.common.Result;
import com.sniper.readwritespringboot.common.ResultWrap;
import com.sniper.readwritespringboot.entity.User;
import com.sniper.readwritespringboot.mapper.UserMapper;
import com.sniper.readwritespringboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/9/19 3:26 PM
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> userList() {
        List<User> list = userMapper.selectList();
        return list;
    }

    @Override
    public Result<Object> addUser() {
        User user = User.builder()
                .name("sniper")
                .age(27)
                .address("北京市")
                .build();
        userMapper.insert(user);
        return ResultWrap.getSuccess();
    }

    /**
     * @Transactional(readOnly = false) 强制这个接口走主库
     * @return
     */
    @Override
    @Transactional(readOnly = false)
    public Result<List<User>> addAndGetList() {
        User user = User.builder()
                .name("王五")
                .age(23)
                .address("天津市")
                .build();
        userMapper.insert(user);
        List<User> users = userMapper.selectList();
        return ResultWrap.getSuccess(users);
    }
}
