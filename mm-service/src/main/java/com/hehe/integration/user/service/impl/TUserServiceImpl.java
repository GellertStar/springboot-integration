package com.hehe.integration.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hehe.integration.entity.TUser;
import com.hehe.integration.mapper.TUserMapper;
import com.hehe.integration.user.service.ITUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author genglei
 * @since 2024-02-19
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
