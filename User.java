package com.spring.springsecurityjwt.entity;

import java.util.List;
import java.util.stream.Collector;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_TBL")

public class User {
	@Id
	private int id;
	private String UserName;
	private String Password;
	private String email;
	public User(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return null;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		Password = password;
	}

	


	
	

}
