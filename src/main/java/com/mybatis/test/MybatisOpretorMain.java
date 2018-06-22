package com.mybatis.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mybatis.dao.OperatorsDao;
import com.mybatis.pojo.Operators;
import com.mybatis.resource.AppConfig;

public class MybatisOpretorMain {

	public static void main(String[] args) {
		PrintStudentData print = new PrintStudentData();
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		OperatorsDao dao = context.getBean(OperatorsDao.class);
		
	/*	String role ="HR";
		Boolean disable = true;
		print.printAll(dao.findByRoleAndDisable(role, disable));*/
		
//		System.out.println(dao.countOperators());
		
//		System.out.println(dao.findAllRoles().toString());
		
		/*Operators operators = new Operators();
		String username = "陈yy";
		operators.setUsername(username);
		String password = "123456";
		operators.setPassword(password);
		role = "HR";
		operators.setRole(role);
		boolean disabled = true;
		operators.setDisabled(disabled);
		dao.create(operators);
		System.out.println("增加的管理员id为："+operators.getId());*/
		
		//批量修改用户的权限
		Boolean disabled = true;
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(2);
		ids.add(3);
		dao.batchDisable(ids, disabled);
		//根据姓名模糊查询
		print.printAll(dao.findByUsernameLike("老"));
		
	}

}
