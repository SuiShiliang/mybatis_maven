package com.mybatis.pojo;

import java.util.List;

public class Press {

	private Long pr_id; 
	private String pr_name; 
	private String pr_introduction;
//	一对多，一个出版社会出版多个书籍
	private List<Books> books;
	public Long getPr_id() {
		return pr_id;
	}
	public void setPr_id(Long pr_id) {
		this.pr_id = pr_id;
	}
	public String getPr_name() {
		return pr_name;
	}
	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}
	public String getPr_introduction() {
		return pr_introduction;
	}
	public void setPr_introduction(String pr_introduction) {
		this.pr_introduction = pr_introduction;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	
}
