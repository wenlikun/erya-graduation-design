package com.graduation.common.bcrypt;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
public interface PasswordEncoder {

    String encode(CharSequence rawPassword);


    boolean matches(CharSequence rawPassword, String encodedPassword);


    default boolean upgradeEncoding(String encodedPassword) {
        return false;
    }

}
