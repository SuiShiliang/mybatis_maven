package com.mybatis.pojo;

import java.util.List;

public class Permission {

	private Long id; 
	private String name; 
	private String describe;
	
	private List<Role> role;
	
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", describe=" + describe + ", role=" + role + "]";
	}
	
}
