package com.mybatis.dao;

import java.util.List;

import com.mybatis.pojo.Books;

public interface BookInfoDao {

	public Books findOne(Long bookId);
	
	public Books findOneAndBookComments(Long bookId);
	
	public List<Books> findAll();
}
