package com.hehe.integration.user;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hehe.integration.entity.User;
import com.hehe.integration.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> getUsers() {
        List<User> users = getBaseMapper().getUsers();
        return users;
    }

//    @Resource
//    private UserService userService;


//    @Override
//    public List<User> getUsers() {
//        ArrayList<User> users = new ArrayList<>();
//        return users;
//    }
}