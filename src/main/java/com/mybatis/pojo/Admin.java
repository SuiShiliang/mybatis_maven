package com.mybatis.pojo;


public class Admin {

	private Long id; 
	private String name; 
	private String password; 
	private boolean disable; 
	private Role role;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isDisable() {
		return disable;
	}
	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", disable=" + disable + ", role="
				+ role + "]";
	}
	
}
