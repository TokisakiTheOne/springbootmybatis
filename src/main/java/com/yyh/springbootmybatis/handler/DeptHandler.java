package com.yyh.springbootmybatis.handler;

import com.yyh.springbootmybatis.po.Dept;
import com.yyh.springbootmybatis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YanYuHang
 * @create 2020-04-24-14:28
 */
@Controller
@RequestMapping("/dept")
public class DeptHandler {

    //注入业务逻辑接口
    @Autowired
    private DeptService ds;


    //查询全部
    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        model.addAttribute("depts", ds.selectAll());
        return "dept/selectAll";
    }

    //查询全部
    @RequestMapping("/selectById")
    public String selectAll(int dept_id, Model model) {
        model.addAttribute("dept", ds.selectById(dept_id));
        return "dept/update";
    }

    @RequestMapping("/toInsert")
    public String toInsert() {
        return "dept/insert";
    }

    @RequestMapping("/insert")
    public String insert(Dept dept) {
        ds.insert(dept);
        return "redirect:/dept/selectAll";
    }

    @RequestMapping("/delete")
    public String delete(int dept_id) {
        ds.delete(dept_id);
        return "redirect:/dept/selectAll";
    }

    @RequestMapping("/update")
    public String update(Dept dept) {
        ds.update(dept);
        return "redirect:/dept/selectAll";
    }

}
