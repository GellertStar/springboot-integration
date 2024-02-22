package com.hehe.integration.user;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.hehe.integration.common.dto.response.Response;
import com.hehe.integration.entity.User;
import com.hehe.integration.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author sxl
 * @CreateTime 2024-02-21
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("list")
    public Response list() {
        try {
            List<User> listUser = userService.list();
            List<User> voList = new ArrayList<>();
            if(CollectionUtil.isNotEmpty(listUser)){
                voList = JSON.parseObject(JSON.toJSONString(listUser),
                        new TypeReference<List<User>>(){});
            }
            return Response.ok(voList);
        } catch (Exception e) {
            return Response.fail();
        }

    }
}
