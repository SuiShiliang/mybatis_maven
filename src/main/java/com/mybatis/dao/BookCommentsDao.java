package com.mybatis.dao;


import com.mybatis.pojo.BookComments;

public interface BookCommentsDao {

	public BookComments findById(Long id);
}
