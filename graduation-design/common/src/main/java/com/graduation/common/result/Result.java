package com.graduation.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    public Result(T data){
        success(data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> Result<T> forbidden(T data) {
        return new Result<T>(403, "没有相关权限", data);
    }

    /**
     * 未登录返回结果
     */
    public static <T> Result<T> unauthorized(T data) {
        return new Result<T>(401, "暂未登录或token已经过期", data);
    }

    /**
     * 资源不可用返回结果
     */
    public static <T> Result<T> notAvailable(T data) {
        return new Result<T>(40101, "资源不可用", data);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> Result<T> validateFailed(String message) {
        return new Result<T>(404, message, null);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(200, "操作成功", data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> Result<T> serviceError(String message,T data) {
        return new Result<T>(500, message, data);
    }
}
