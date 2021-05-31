package com.examole.springfils.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * @author zhongyushi
 * @date 2020/6/24 0024
 * @dec 用户实体
 */
@Data
@ExcelTarget("users")//没有什么实际意义，就是对于easypoi有个唯一的标识
public class User {

    /**
     * 用户名
     */
    @Excel(name = "用户名")
    private String username;

    /**
     * 姓名
     */
    @Excel(name = "姓名")
    private String name;

    /**
     * 年龄
     */
    @Excel(name = "年龄")
    private Integer age;

    /**
     * 性别,0表示男，1表示女
     */
    @Excel(name = "性别", replace = {"男_0", "女_1"})
    private String sex;

    /**
     * 籍贯
     */
    @Excel(name = "籍贯")
    private String address;
}
