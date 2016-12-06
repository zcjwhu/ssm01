package com.ajin.service;

import com.ajin.mapper.UserMapper;
import com.ajin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ajin on 16-12-6.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public void deleteUserById(Integer id){
        userMapper.deleteByPrimaryKey(id);
    }
}
