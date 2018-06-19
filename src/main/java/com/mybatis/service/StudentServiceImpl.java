package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.StudentDao;
import com.mybatis.pojo.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Student findOne(int number) {
		// TODO Auto-generated method stub
		return dao.findOne(number);
	}

	@Override
	public void add(Student student) {
		dao.add(student);
	}

	@Override
	public void delete(int number) {
		dao.delete(number);
	}

	@Override
	public void update(Student student) {
		dao.update(student);
	}

	
	public void printStudent(Student ss) {
		System.out.println(String.format("学号：%d\t姓名：%s\t性别：%s\t年龄：%d\t专业：%s", 
				ss.getNumber(),
				ss.getName(),
				ss.getGender(),
				ss.getAge(),
				ss.getMajor()
				));
	}
	@Override
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
