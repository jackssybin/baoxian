package com.kaisagroup.baoxian.service.impl;

import com.kaisagroup.baoxian.entity.User;
import com.kaisagroup.baoxian.mapper.UserMapper;
import com.kaisagroup.baoxian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建人：thj
 * 创建时间： 2018/6/25 14:09
 * 用途：
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUserList(String name ,int page,int limit) {

        return userMapper.getUserList(name,page,limit);
    }


    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public int getUserCount() {
        return userMapper.getUserCount();

    }
}