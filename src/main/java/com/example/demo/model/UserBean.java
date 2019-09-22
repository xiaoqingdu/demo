package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class UserBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String username;
	private String sex;
	private long idcard;
	private long telphone;
	private String password;
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getIdcard() {
		return idcard;
	}

	public void setIdcard(long idcard) {
		this.idcard = idcard;
	}

	public long getTelphone() {
		return telphone;
	}

	public void setTelphone(long telphone) {
		this.telphone = telphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
