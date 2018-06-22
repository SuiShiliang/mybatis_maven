package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.pojo.Operators;

public interface OperatorsDao {

	// 需要将生成的主键set到pojo参数operator上
	public void create(Operators operators);

	// 根据角色和禁用状态查询管理员
	public List<Operators> findByRoleAndDisable(@Param("role") String role, @Param("disable") Boolean disable);

	// 查询管理员数量
	public Integer countOperators();

	// 查询所有角色名（去重、去null）
	public List<String> findAllRoles();

	// 查询用户名包含关键字的管理员
	public List<Operators> findByUsernameLike(@Param("username") String username);

	// 批量禁用或启用管理员
	public void batchDisable(@Param("ids") List<Integer> ids, @Param("disabled") Boolean disabled);

}
