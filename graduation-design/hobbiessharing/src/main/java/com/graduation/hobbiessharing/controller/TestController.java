package com.graduation.hobbiessharing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名: design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@RestController
@RequestMapping("/hobbies")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hobbies-test";
    }


}
