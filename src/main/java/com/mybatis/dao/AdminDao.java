package com.mybatis.dao;

import java.util.List;

import com.mybatis.pojo.Admin;

public interface AdminDao {

	public Admin finOne(Long id);
	
	public List<Admin> findAll();
}
