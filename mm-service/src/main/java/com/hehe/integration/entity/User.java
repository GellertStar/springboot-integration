package com.hehe.integration.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hehe.integration.common.dto.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User extends BaseEntity implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 最后登录租户id
     */
    @TableField(value = "last_tenant_id")
    private Long lastTenantId;

    /**
     * 最后登录服务商租户id
     */
    @TableField(value = "last_service_id")
    private Long lastServiceId;

    /**
     * 状态：0停用 1 启用
     */
    @TableField(value = "status")
    private Integer status;

}