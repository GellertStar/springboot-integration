package com.hehe.integration.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hehe.integration.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

     List<User> getUsers();
}