package com.hehe.integration.common.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 返回结果类
 * @Author genglei
 * @CreateTime 2024-02-04
 * @Version 1.0
 */
@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -7820440789897476265L;

    public static final int SUCCESS = 200;
    public static final int ERROR = 500;
    public static final String SUCCESS_MSG = "成功";
    public static final String ERROR_MSG = "失败";

    private Integer code;

    private String message;

    private T data;

    private Response() {}

    private Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Response(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Boolean judgeSuccess() {
        return this.code == SUCCESS;
    }

    public static <T> Response<T> ok() {
        return new Response<>(SUCCESS, SUCCESS_MSG);
    }

    public static <T> Response<T> ok(String message) {
        return new Response<>(SUCCESS, message);
    }

    public static <T> Response<T> ok(T data) {
        return new Response<>(SUCCESS, SUCCESS_MSG, data);
    }

    public static <T> Response<T> fail() {
        return new Response<>(ERROR, ERROR_MSG);
    }

    public static <T> Response<T> fail(String message) {
        return new Response<>(ERROR, message);
    }

    public static <T> Response<T> fail(int code, String message) {
        return new Response<>(code, message);
    }

    public static <T> Response<T> build(int code, String message) {
        return new Response<>(code, message);
    }

    public static <T> Response<T> build(int code, String message, T data) {
        return new Response<>(code, message, data);
    }
}
