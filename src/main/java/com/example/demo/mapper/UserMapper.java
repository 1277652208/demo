package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User find(int id);
    int update(String id);
}
