package com.yyh.springbootmybatis.handler;

import com.yyh.springbootmybatis.po.EmpResult;
import com.yyh.springbootmybatis.service.DeptService;
import com.yyh.springbootmybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2020-04-27-10:41
 */
@RestController
@RequestMapping("/empjson")
@CrossOrigin
public class EmpJsonHandler {


    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;


    @RequestMapping("/selectAll")
    public Object selectAll() {
        return empService.selectAll();
    }

    @RequestMapping("/delete")
    public Object delete(int emp_id){
        return empService.delete(emp_id);
    }

    @RequestMapping("/selectById")
    public Object selectById(int emp_id){
        return new EmpResult(empService.selectById(emp_id), deptService.selectAll());
    }
}
