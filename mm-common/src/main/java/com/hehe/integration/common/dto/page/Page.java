package com.hehe.integration.common.dto.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 分页类
 * @Author genglei
 * @CreateTime 2024-02-04
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 7137724128293391633L;
    /**
     * 当前页码
     */
    @Builder.Default
    private Long page = 1L;

    /**
     * 每页行数
     */
    @Builder.Default
    private Long pageSize = 10L;

    /**
     * 总行数
     */
    private Long total;

    /**
     * 总页数
     */
    private Long totalPage;

    /**
     * 数据列表
     */
    private List<T> records;
}
