package com.hehe.integration.common.dto.request;

/**
 * @Description: 返回结果类
 * @Author genglei
 * @CreateTime 2024-02-04
 * @Version 1.0
 */
public class PageRequest extends Request{
    private static final long serialVersionUID = 735108844426812599L;
    /**
     * 当前页码
     */
    private Long page = 1L;

    /**
     * 每页行数
     */
    private Long pageSize = 10L;
}
