package com.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mybatis.dao.StudentDao;
import com.mybatis.pojo.Gender;
import com.mybatis.pojo.Student;
import com.mybatis.resource.AppConfig;
import com.mybatis.service.StudentService;

public class MybatisSessionFactory {

	public static void main(String[] args) throws IOException {

		PrintStudentData print = new PrintStudentData();

		/*// 使用Mybatis-config.xml 配置方式获取类
		String resoure = "Mybatis-config.xml";
		InputStream inputStream;
		inputStream = Resources.getResourceAsStream(resoure);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		List<Student> list = dao.findAll();
		// System.out.println(list);
		print.printAll(list,0);
		
		Student ss = dao.findOne(2);
		print.printAll(ss,1);
		session.close();*/

		// 使用appconfig.java配置获取类
		// （需删除Mybatis-config.xml中的所有，只剩下<configuration></configuration>）
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao dao = context.getBean(StudentDao.class);
		List<Student> list = dao.findAll();
		System.out.println("查询所有账户信息：");
		print.printAll(list,0);
		System.out.println("根据id查询数据");
		print.printAll(dao.findOne(6),1);
		System.out.println("添加数据");
		Student student = new Student();
		student.setName("添加");
		student.setGender(Gender.Famale);
		student.setAge(12);
		student.setMajor("测试");
		dao.add(student );
		print.printAll(dao.findAll(),0);
		System.out.println("修改数据");
		student.setNumber(43);
		student.setName("修改");
		student.setMajor("修改测试");
		dao.update(student);
		print.printAll(dao.findOne(43),1);
		System.out.println("删除数据");
		dao.delete(44);
		dao.delete(45);
		dao.delete(46);
		print.printAll(dao.findAll(),0);
	}

}
