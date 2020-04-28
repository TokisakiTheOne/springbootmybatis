package com.yyh.springbootmybatis.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author YanYuHang
 * @create 2020-04-27-10:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {



    private int emp_id;

    private String emp_name;

    private int emp_age;

    private Dept dept;
}
