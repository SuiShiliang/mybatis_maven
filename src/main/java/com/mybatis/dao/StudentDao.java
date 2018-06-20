package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.pojo.Gender;
import com.mybatis.pojo.Student;

public interface StudentDao {
	//查询所有用户信息
	public List<Student> findAll();
	//查询个人信息
	public Student findOne(int number);
	//增加用户
	public void add(Student student);
	//删除用户
	public void delete(int number);
	//修改用户
	public void update(Student student);
	
	//根据性别与专业查询数据
	//多个传参，需给每个加上@param("参数名")
	public List<Student> findByGenderAndMajor(
			@Param("gender") Gender gender,
			@Param("major") String major);
	
	//返回如果是单列，尽量使用包装类，如long 使用Long 
	//查询学生人数
	public Long countStudent();
	//查询所有的专业
	public List<String> findAllMajor();
}
