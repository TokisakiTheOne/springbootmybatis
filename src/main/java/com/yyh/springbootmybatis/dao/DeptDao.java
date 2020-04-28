package com.yyh.springbootmybatis.dao;

import com.yyh.springbootmybatis.po.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-24-14:24
 * @Mapper = Spring配置文件中的  MapperScannerConfig
 */
@Mapper
public interface DeptDao {

    @Select("select * from dept")
    List<Dept> selectAll();

    @Select("select * from dept where dept_id=#{dept_id}")
    Dept selectById(int dept_id);

    @Insert("insert into dept (dept_name) values (#{dept_name});")
    int insert(Dept dept);

    @Update("update dept set dept_name = #{dept_name} where dept_id=#{dept_id};")
    int update(Dept dept);

    @Delete("delete from dept where dept_id =#{dept_id}")
    int delete(int dept_id);


}
