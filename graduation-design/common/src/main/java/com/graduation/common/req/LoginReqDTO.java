package com.graduation.common.req;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LoginReqDTO extends BaseDTO {

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String userName;

    /**
     * 密码
     */
    @NotBlank(message = "登录密码不能为空")
    private String password;

}
