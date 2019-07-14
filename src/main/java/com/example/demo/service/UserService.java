package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
 /*   @Autowired
    private RedisTemplate<Object,Object> redisTemplate;*/
     public User find(int id){
        return userMapper.find(id);
    }
    @Transactional//事务使用
    public int update(String id){
        int i = userMapper.update(id);
        return i;
    }
}
