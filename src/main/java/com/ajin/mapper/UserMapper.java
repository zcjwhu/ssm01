package com.ajin.mapper;

import com.ajin.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertUser(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUserByName(String name);
}