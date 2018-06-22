package com.mybatis.test;

import java.util.ArrayList;
import java.util.List;

import com.mybatis.pojo.Authors;
import com.mybatis.pojo.BookComments;
import com.mybatis.pojo.Books;
import com.mybatis.pojo.Operators;
import com.mybatis.pojo.Student;

public class PrintStudentData {

	private void printStudent(Student ss) {
		System.out.println(String.format("【学号】：%d\t【姓名】：%s\t【性别】：%s\t【年龄】：%d\t【专业】：%s", ss.getNumber(), ss.getName(),
				ss.getGender(), ss.getAge(), ss.getMajor()));
	}

	private void printOperators(Operators op) {
		System.out.println(String.format("【工号】：%d\t【姓名】：%s\t【密码】：%s\t【职责】：%s\t【权限】：%s", op.getId(), op.getUsername(),
				op.getPassword(), op.getRole(), op.isDisabled()));
	}

	private void printBooks(Books book) {
		String books = String.format("【书籍id】：%d\t【书籍名】：%s\t【书籍简介】：%s\t", book.getBook_id(), book.getBook_name(),
				book.getBook_introduction());
		String press = "【出版社】：无\t";
		if (book.getPress() != null)
			press = String.format("【出版社】：%s\t", book.getPress().getPr_name());
		String authors = "【作者】：无\t";
		if (book.getAuthors() != null) {
			authors = "【作者】：";
			int flag = 0;
			for (Authors au : book.getAuthors()) {
				authors += au.getAu_name();
				//判断是否为最后一个作者名，不是则加上分隔符 “、”
				if(flag ++ + 1 <book.getAuthors().size()) {
					authors += "、";
				}
			}
			authors += "\t";
		}
		String comments = "【评论】：\t";
		if(book.getBookComments() != null) {
			comments = "【评论】：";
			int number = 1;
			for(BookComments co : book.getBookComments()) {
				comments += "-第"+ number++ + "条评论:" + co.getBook_comment() +"- ";
			}
		}
		System.out.println(books + press + authors + comments);
	}

	private void printBookComments(BookComments boc) {
		String BookComments = String.format("【评论id】：%d\t【评论】：%s\t", boc.getBook_comment_id(), boc.getBook_comment());
		String bookName = "【书籍】:\t";
		if (boc.getBook() != null) {
			bookName = String.format("【书籍】:%s\t", boc.getBook().getBook_name());
		}
		System.out.println(BookComments + bookName);
	}

	public void printFH() {
		System.out.println(
				"--------------------------------------------------------------------------------------------");
	}

	@SuppressWarnings("unchecked")
	public void printAll(Object object) {
		// 无论传过来的是List<对象>还是单个对象，都转换成List<Object>
		List<Object> list;
		if (!(object.getClass().getSimpleName().equals("ArrayList"))) {
			list = new ArrayList<>();
			list.add(object);
		} else {
			list = (List<Object>) object;
		}
		// 输出行数
		int number = 1;
		// 获取对象的名，调用相应的对象输出函数
		switch (list.get(0).getClass().getSimpleName()) {
		case "Authors":
			printFH();

			break;

		case "Books":
			for (Object obj : list) {
				System.out.print(number++ + ":");
				printBooks((Books) obj);
			}
			printFH();
			break;
		case "Operators":
			for (Object obj : list) {
				System.out.print(number++ + ":");
				printOperators((Operators) obj);
			}
			printFH();
			break;
		case "Press":
			printFH();

			break;
		case "Student":
			for (Object obj : list) {
				System.out.print(number++ + ":");
				printStudent((Student) obj);
			}
			printFH();
			break;
		case "BookComments":
			for (Object obj : list) {
				System.out.print(number++ + ":");
				printBookComments((BookComments) obj);
			}
			printFH();
			break;
		default:
			break;
		}
	}

}
