package com.yyh.springbootmybatis.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-27-11:59
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpResult {

    private Emp emp;

    private List<Dept> depts;



}
