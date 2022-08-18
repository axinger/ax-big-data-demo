package com.axing.demo.web.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * @TableName user
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     *
     */
    @TableId
    private Long id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}