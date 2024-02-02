package com.hehe.integration.user;

import com.hehe.integration.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("list")
    public R list() {
        try {
            return R.isOk().data(userService.getUsers());
        } catch (Exception e) {
            return R.isFail(e);
        }
    }

}