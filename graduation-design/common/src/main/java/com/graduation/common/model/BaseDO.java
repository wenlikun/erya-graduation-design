package com.graduation.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@Getter
@Setter
@ToString
public class BaseDO implements Serializable {

    /**
     * 数据库主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 删除标识 可用：USABLE 不可用：UN_USABLE
     */
    private String usableFlag;
}
