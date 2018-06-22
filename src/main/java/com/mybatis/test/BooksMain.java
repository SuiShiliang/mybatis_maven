package com.mybatis.test;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mybatis.dao.BookCommentsDao;
import com.mybatis.dao.BookInfoDao;
import com.mybatis.pojo.Books;
import com.mybatis.resource.AppConfig;

public class BooksMain {

	public static void main(String[] args) {

		PrintStudentData print = new PrintStudentData();

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);	
		BookInfoDao dao = context.getBean(BookInfoDao.class);
		//根据id查找书籍
		Books book = dao.findOne(2L);
		print.printFH();
		System.out.println("根据id查找书籍");
		print.printAll(book);
		
		//根据id查找书籍，并将评论一并查询出来
		Books book2 = dao.findOneAndBookComments(2L);
		print.printFH();
		System.out.println("根据id查找书籍");
		print.printAll(book2);
		
		//查询所有书籍信息
		List<Books> list = dao.findAll();
		print.printFH();
		System.out.println("查询所有书籍");
		print.printAll(list);
		
		//根据评论id查询书籍名
		BookCommentsDao dao1 = context.getBean(BookCommentsDao.class);
		print.printFH();
		System.out.println("根据评论id查询书籍名");
		print.printAll(dao1.findById(2L));
	}

}
