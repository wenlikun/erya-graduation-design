package com.graduation.account.controller;

import com.graduation.account.service.AccountService;
import com.graduation.common.req.LoginReqDTO;
import com.graduation.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    public Result<Boolean> login(@RequestBody LoginReqDTO loginReqDTO) {
        return Result.success(accountService.login(loginReqDTO.getUserName(), loginReqDTO.getPassword()) != null);
    }

}
