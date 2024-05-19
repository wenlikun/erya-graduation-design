package com.graduation.account.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.graduation.common.model.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Data
@TableName("sys_user")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AccountDO extends BaseDO {

    private String userName;
    private String password;
    private String avatar;
    private String nickName;
    private String userPhone;
    private String userEmail;
    private String gender;
    private String department;
}
