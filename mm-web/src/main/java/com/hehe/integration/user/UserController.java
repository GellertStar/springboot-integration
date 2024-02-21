package com.hehe.integration.user;

import com.hehe.integration.common.dto.entity.R;
import com.hehe.integration.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public R list() {
        try {
            return R.isOk().data(userService.list());
        } catch (Exception e) {
            return R.isFail(e);
        }

    }
}
