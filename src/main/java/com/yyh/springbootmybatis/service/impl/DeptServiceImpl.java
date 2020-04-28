package com.yyh.springbootmybatis.service.impl;

import com.yyh.springbootmybatis.dao.DeptDao;
import com.yyh.springbootmybatis.po.Dept;
import com.yyh.springbootmybatis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-24-14:27
 */
@Service
public class DeptServiceImpl implements DeptService {

    //注入dao接口
    @Autowired
    private DeptDao d;

    @Override
    public List<Dept> selectAll() {
        return d.selectAll();
    }

    @Override
    public Dept selectById(int dept_id) {
        return d.selectById(dept_id);
    }

    @Override
    public int insert(Dept dept) {
        return d.insert(dept);
    }

    @Override
    public int update(Dept dept) {
        return d.update(dept);
    }

    @Override
    public int delete(int dept_id) {
        return d.delete(dept_id);
    }
}
