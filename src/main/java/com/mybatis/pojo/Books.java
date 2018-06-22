package com.mybatis.pojo;

import java.util.List;

public class Books {

	private Long book_id; 
	private String book_name; 
	private String book_introduction; 
/*//	一对多 ，一本书可能会有多个出版社
	private List<Press> press;*/
//	一对一，一本书有一个出版社
	private Press press;
//	一对多，一本书可能会有多个作者编写
	private List<Authors> authors;
//	一对多，一本书可能会有多个评论
	private List<BookComments> bookComments;
	
	
	public List<BookComments> getBookComments() {
		return bookComments;
	}
	public void setBookComments(List<BookComments> bookComments) {
		this.bookComments = bookComments;
	}
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_introduction() {
		return book_introduction;
	}
	public void setBook_introduction(String book_introduction) {
		this.book_introduction = book_introduction;
	}
	public Press getPress() {
		return press;
	}
	public void setPress(Press press) {
		this.press = press;
	}
	public List<Authors> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}
	
	
}
