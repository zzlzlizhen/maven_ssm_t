package com.zsm.entities;

public class User {
	private int id;
	private String email;
	private String password;
	private String phone;
	private String sex;
	private String sfz;
	private String truename;
	private String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public User(int id, String email, String password, String phone,
			String sex, String sfz, String truename, String username) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.sex = sex;
		this.sfz = sfz;
		this.truename = truename;
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSfz() {
		return sfz;
	}
	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
