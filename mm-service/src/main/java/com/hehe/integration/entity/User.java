package com.hehe.integration.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hehe.integration.common.dto.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class User extends BaseEntity {

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
    private Long last_tenant_id;

    /**
     * 最后登录服务商租户id
     */
    @TableField(value = "last_service_id")
    private Long last_service_id;

    /**
     * 状态：0停用 1 启用
     */
    @TableField(value = "status")
    private Integer status;

}