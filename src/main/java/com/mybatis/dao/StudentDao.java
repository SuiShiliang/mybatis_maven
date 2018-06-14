package com.mybatis.dao;

import java.util.List;

import com.mybatis.pojo.Student;

public interface StudentDao {
	
	public List<Student> findAll();

}
