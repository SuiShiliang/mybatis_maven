package com.mybatis.test;

import java.util.List;

import com.mybatis.pojo.Operators;
import com.mybatis.pojo.Student;

public class PrintStudentData {

	public void printStudent(Student ss) {
		System.out.println(String.format("学号：%d\t姓名：%s\t性别：%s\t年龄：%d\t专业：%s", 
				ss.getNumber(), 
				ss.getName(),
				ss.getGender(), 
				ss.getAge(), 
				ss.getMajor()));
	}

	private void printOperators(Operators op) {
		System.out.println(String.format("工号：%d\t姓名：%s\t密码：%s\t职责：%s\t权限：%s", 
				op.getId(),
				op.getUsername(),
				op.getPassword(),
				op.getRole(),
				op.isDisabled()
				));
	}

	public void printAll(Object... objects) {

		// objects[1] = 1 代表输出是单个Student
		if (Integer.parseInt(objects[1].toString()) == 1) {
			printStudent((Student) objects[0]);
		} else {
			if (Integer.parseInt(objects[1].toString()) == 0) {
				@SuppressWarnings("unchecked")
				List<Student> list = (List<Student>) objects[0];
				for (Student ss : list) {
					printStudent(ss);
				}
			} else if (Integer.parseInt(objects[1].toString()) == 2) {
				@SuppressWarnings("unchecked")
				List<Operators> list = (List<Operators>) objects[0];
				for (Operators op : list) {
					printOperators(op);
				}
			}

		}

	}

}
