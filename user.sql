create table user
(
    id              bigint auto_increment comment '主键id'
        primary key,
    username        varchar(64)                          not null comment '账号',
    password        varchar(64)                          not null comment '密码',
    last_tenant_id  bigint                               null comment '最后登录租户id',
    last_service_id bigint                               null comment '最后登录服务商租户id',
    status          tinyint(3) default 1                 not null comment '状态：0停用 1 启用',
    create_user     bigint                               null comment '创建者id',
    create_time     datetime   default CURRENT_TIMESTAMP not null comment '创建时间',
    update_user     bigint                               null comment '修改者id',
    update_time     datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    is_del          tinyint(3) default 0                 not null comment '删除标识：0 未删除，1 已删除',
    constraint uk_1
        unique (username)
)
    comment '用户表' row_format = DYNAMIC;