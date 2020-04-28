package com.yyh.springbootmybatis.service;

import com.yyh.springbootmybatis.po.Dept;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-24-14:27
 */
public interface DeptService {


    List<Dept> selectAll();


    Dept selectById(int dept_id);

    int insert(Dept dept);

    int update(Dept dept);

    int delete(int dept_id);
}
