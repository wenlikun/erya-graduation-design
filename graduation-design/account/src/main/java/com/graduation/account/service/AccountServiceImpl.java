package com.graduation.account.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.graduation.account.mapper.AccountMapper;
import com.graduation.account.model.AccountDO;
import com.graduation.common.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public AccountDO login(String userName, String password) {
        QueryWrapper<AccountDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", userName);

        AccountDO accountDO = accountMapper.selectOne(queryWrapper);
        if (accountDO != null && !PASSWORD_ENCODER.matches(password, accountDO.getPassword())) {
            return null;
        }
        return accountDO;
    }
}
