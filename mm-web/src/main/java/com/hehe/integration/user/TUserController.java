package com.hehe.integration.user;


import com.hehe.integration.common.dto.entity.R;
import com.hehe.integration.user.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author genglei
 * @since 2024-02-19
 */
@RestController
@RequestMapping("/t-user")
public class TUserController {
    @Autowired
    ITUserService itUserService;

    @GetMapping("list")
    public R list() {
        try {
            return R.isOk().data(itUserService.list());
        } catch (Exception e) {
            return R.isFail(e);
        }

    }
}
