package com.yasong.yin.playinggo.service;

import com.yasong.yin.playinggo.entity.User;
import com.yasong.yin.playinggo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public User getUserById(Long id){

        return userMapper.selectByPrimaryKey(id);
    }
}
