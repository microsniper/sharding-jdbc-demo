package com.sniper.readwritespringboot.mapper;

import com.sniper.springbootreadwrite.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectList();

    int insert(User user);
}
