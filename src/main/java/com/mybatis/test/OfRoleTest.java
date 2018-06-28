package com.mybatis.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mybatis.dao.AdminDao;
import com.mybatis.dao.PermissionDao;
import com.mybatis.dao.RoleDao;
import com.mybatis.resource.AppConfig;

public class OfRoleTest {

	public static void main(String[] args) {
		PrintStudentData print = new PrintStudentData();
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AdminDao adminDao = context.getBean(AdminDao.class);
		
		print.printFH();
		System.out.println("admin findOne");
		print.printAll(adminDao.finOne(2L));
		
		print.printFH();
		System.out.println("admin findAll");
		print.printAll(adminDao.findAll());
		
		
		RoleDao roleDao = context.getBean(RoleDao.class);
		print.printFH();
		System.out.println("role findAll");
		print.printAll(roleDao.findAll());
		
		PermissionDao permissionDao = context.getBean(PermissionDao.class);
		print.printFH();
		System.out.println("permission findAll");
		print.printAll(permissionDao.findAll());
	}

}
