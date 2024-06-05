package com.graduation.account.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Data
@TableName("family_user")
@ToString(callSuper = true)
public class AccountDO {

    private String userName;
    private String userRoleCode;
    private String userFamilyCode;
    private Date userBirthday;
    private String userPassword;
}
