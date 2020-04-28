package com.yyh.springbootmybatis.handler;

import com.yyh.springbootmybatis.po.Emp;
import com.yyh.springbootmybatis.service.DeptService;
import com.yyh.springbootmybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2020-04-27-10:41
 */
@Controller
@RequestMapping("/emp")
public class EmpHandler {


    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;


    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        model.addAttribute("emps",empService.selectAll());
        return "emp/selectAll";
    }

    @RequestMapping("/selectById")
    public String selectById(int emp_id,Model model){
        model.addAttribute("emp",empService.selectById(emp_id));
        model.addAttribute("depts",deptService.selectAll());
        return "emp/update";
    }


    @RequestMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/selectAll";
    }
    @RequestMapping("/insert")
    public String insert(Emp emp){
        empService.insert(emp);
        return "redirect:/emp/selectAll";
    }
    @RequestMapping("/delete")
    public String delete(int emp_id){
        empService.delete(emp_id);
        return "redirect:/emp/selectAll";
    }

    @RequestMapping("/toInsert")
    public String toInsert(Model model){
        model.addAttribute("depts",deptService.selectAll());
        return "emp/insert";
    }






}
