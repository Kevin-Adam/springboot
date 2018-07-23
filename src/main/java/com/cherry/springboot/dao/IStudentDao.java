package com.cherry.springboot.dao;

import com.cherry.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhangpcxy@163.com
 * @create 2018/7/23 11:47
 * @desc
 */
@Mapper
public interface IStudentDao {

    @Select("SELECT * FROM student_info")
    List<Student> selectAll();

}
