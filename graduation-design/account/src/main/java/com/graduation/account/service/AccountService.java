package com.graduation.account.service;

import com.graduation.account.model.AccountDO;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
public interface AccountService {

    AccountDO login(String userName, String password);

}
