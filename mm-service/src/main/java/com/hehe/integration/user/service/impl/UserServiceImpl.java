package com.hehe.integration.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hehe.integration.entity.User;
import com.hehe.integration.mapper.UserMapper;
import com.hehe.integration.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
//    @Resource
//    private UserService userService;
    @Override
    public List<User> getUsers() {
//        List<User> users = getBaseMapper().getUsers();
//        List<User> users = userService.list();
        List<User> users = lambdaQuery().eq(User::getId, Integer.valueOf(1)).list();
        return users;
    }


}