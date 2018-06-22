package com.mybatis.pojo;

public class BookComments {

	private Long book_comment_id;
	private String book_comment;
	private Books book;
	
	public Long getBook_comment_id() {
		return book_comment_id;
	}
	public void setBook_comment_id(Long book_comment_id) {
		this.book_comment_id = book_comment_id;
	}
	public String getBook_comment() {
		return book_comment;
	}
	public void setBook_comment(String book_comment) {
		this.book_comment = book_comment;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	
}
