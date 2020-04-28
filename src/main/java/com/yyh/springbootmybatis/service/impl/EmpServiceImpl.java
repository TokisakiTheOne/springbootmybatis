package com.yyh.springbootmybatis.service.impl;

import com.yyh.springbootmybatis.dao.EmpDao;
import com.yyh.springbootmybatis.po.Emp;
import com.yyh.springbootmybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-27-10:39
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;


    @Override
    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    @Override
    public Emp selectById(int emp_id) {
        return empDao.selectById(emp_id);
    }

    @Override
    public int update(Emp emp) {
        return empDao.update(emp);
    }

    @Override
    public int insert(Emp emp) {
        return empDao.insert(emp);
    }

    @Override
    public int delete(int emp_id) {
        return empDao.delete(emp_id);
    }
}
