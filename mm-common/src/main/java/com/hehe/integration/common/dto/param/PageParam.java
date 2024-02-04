package com.hehe.integration.common.dto.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

/**
 * @Description: 分页请求参数类
 * @Author genglei
 * @CreateTime 2024-02-04
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class PageParam extends Param{
    private static final long serialVersionUID = 2282341823946145319L;

    /**
     * 当前页码
     */
    @NotNull(message = "当前页码不能为空")
    private Long page = 1L;

    /**
     * 每页行数
     */
    @NotNull(message = "每页行数不能为空")
    private Long pageSize = 10L;
}
