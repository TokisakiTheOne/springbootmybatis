package com.yyh.springbootmybatis.handler;

import com.yyh.springbootmybatis.po.Dept;
import com.yyh.springbootmybatis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2020-04-24-14:28
 */
@RestController
@RequestMapping("/deptjson")
public class DeptJsonHandler {

    //注入业务逻辑接口
    @Autowired
    private DeptService ds;

    /**
     * 返回 json 对象
     *   @CrossOrigin  允许跨域请求
     * @param
     * @return
     */

    //查询全部
    @RequestMapping("/selectAll")
    @CrossOrigin
    public Object selectAll() {
        System.out.println("接収到了  前端页面的请求");
        return ds.selectAll();
    }

    //查询全部
    @RequestMapping("/selectById")
    public Object selectAll(int dept_id) {
        return ds.selectById(dept_id);
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
