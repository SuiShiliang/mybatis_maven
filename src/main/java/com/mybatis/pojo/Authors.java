package com.mybatis.pojo;

import java.util.List;

public class Authors {

	private Long au_id; 
	private String au_name; 
	private Gender au_gender; 
	private String au_introduction;
	//一对多，一个作者会写很多本书
	private List<Books> books;
	public Long getAu_id() {
		return au_id;
	}
	public void setAu_id(Long au_id) {
		this.au_id = au_id;
	}
	public String getAu_name() {
		return au_name;
	}
	public void setAu_name(String au_name) {
		this.au_name = au_name;
	}
	public Gender getAu_gender() {
		return au_gender;
	}
	public void setAu_gender(Gender au_gender) {
		this.au_gender = au_gender;
	}
	public String getAu_introduction() {
		return au_introduction;
	}
	public void setAu_introduction(String au_introduction) {
		this.au_introduction = au_introduction;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	
}
