package com.xjy.cat.service;

import com.xjy.cat.intf.UserService;
import com.xjy.cat.mapper.UserMapper;
import com.xjy.cat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    private User user = new User();

    @Override
    public User findByUsername(String username) {
        return user;
    }

    public void saveUser(User user){
        userMapper.saveUser(user);
    }
}
