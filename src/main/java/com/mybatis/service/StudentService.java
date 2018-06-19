package com.mybatis.service;

import java.util.List;

import com.mybatis.pojo.Student;

public interface StudentService {

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
		
		//打印信息
		public void printAll(Object...objects);
}
