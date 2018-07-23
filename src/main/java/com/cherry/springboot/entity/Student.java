package com.cherry.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhangpcxy@163.com
 * @create 2018/7/23 11:43
 * @desc
 */
@Getter
@Setter
@ToString
public class Student implements Serializable {

    private static final long serialVersionUID = 1671658130062704119L;

    private Integer id;

    private String  name;

    private String sex;

    private Double grade;

}
