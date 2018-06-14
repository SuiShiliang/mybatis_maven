package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.StudentDao;
import com.mybatis.pojo.Student;

public class MybatisSessionFactory {

	public static void main(String[] args) throws IOException {

		String resoure = "Mybatis-config.xml";
		InputStream inputStream;
		inputStream = Resources.getResourceAsStream(resoure);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		List<Student> list = dao.findAll();
//		System.out.println(list);
		for(Student ss : list) {
			System.out.println(
					String.format("学号：%d\t姓名：%s\t性别：%s\t年龄：%d\t专业：%s", 
					ss.getNumber(),
					ss.getName(),
					ss.getGender(),
					ss.getAge(),
					ss.getMajor()
					));
		}
		session.close();
		
	}

}
