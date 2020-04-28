package com.yyh.springbootmybatis.service;

import com.yyh.springbootmybatis.po.Emp;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-27-10:39
 */
public interface EmpService {


    List<Emp> selectAll();


    Emp selectById(int emp_id);

    int update(Emp emp);

    int insert(Emp emp);

    int delete(int emp_id);
}
