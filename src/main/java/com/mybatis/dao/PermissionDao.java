package com.mybatis.dao;

import java.util.List;

import com.mybatis.pojo.Permission;

public interface PermissionDao {

	public List<Permission> findAll();
}
