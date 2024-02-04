package com.hehe.integration.common.dto.param;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @Description: 请求参数类
 * @Author genglei
 * @CreateTime 2024-02-04
 * @Version 1.0
 */
@NoArgsConstructor
@SuperBuilder
@Data
public class Param implements Serializable {
    private static final long serialVersionUID = -4107218322643222193L;
}
