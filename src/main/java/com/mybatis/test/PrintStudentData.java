package com.mybatis.test;

import java.util.List;

import com.mybatis.pojo.Student;

public class PrintStudentData {

	public void printStudent(Student ss) {
		System.out.println(String.format("学号：%d\t姓名：%s\t性别：%s\t年龄：%d\t专业：%s", 
				ss.getNumber(),
				ss.getName(),
				ss.getGender(),
				ss.getAge(),
				ss.getMajor()
				));
	}
	public void printAll(Object... objects) {
		
		//objects[1] = 1 代表输出是单个Student 
		if(Integer.parseInt(objects[1].toString()) == 1) {
			printStudent((Student)objects[0]);
		}
		else {
			@SuppressWarnings("unchecked")
			List<Student> list = (List<Student>) objects[0];
			for(Student ss : list) {
				printStudent(ss);
			}
		}
		
	}
}
