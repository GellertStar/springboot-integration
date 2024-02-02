package com.hehe.integration.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hehe.integration.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 用户mapper
 * @Author genglei
 * @CreateTime 2024-02-02
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User>{
    List<User> getUsers();
}
