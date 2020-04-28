package com.yyh.springbootmybatis.dao;

import com.yyh.springbootmybatis.po.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-27-10:34
 */
@Mapper
public interface EmpDao {

    @Select("select * from emp")
    @Results(id = "empResults", value = {
            @Result(property = "emp_id", column = "emp_id", id = true),
            @Result(property = "emp_name", column = "emp_name"),
            @Result(property = "emp_age", column = "emp_age"),
            @Result(property = "dept", column = "dept_id", one = @One(select = "com.yyh.springbootmybatis.dao.DeptDao.selectById")),


    })
    List<Emp> selectAll();


    @Select("select * from emp where emp_id=#{emp_id}")
    @ResultMap("empResults")
    Emp selectById(int emp_id);


    @Update("update emp set emp_name = #{emp_name},emp_age=#{emp_age},dept_id=#{dept.dept_id} where emp_id=#{emp_id} ;")
    int update(Emp emp);


    @Insert("insert into emp (emp_name, emp_age, dept_id) values (#{emp_name},#{emp_age},#{dept.dept_id});")
    int insert(Emp emp);

    @Delete("delete  from emp where emp_id=#{emp_id}")
    int delete(int emp_id);
}
