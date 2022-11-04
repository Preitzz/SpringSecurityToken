package com.spring.springsecurityjwt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.springsecurityjwt.entity.User;

import com.spring.springsecurityjwt.repository.UserRepository;



@SpringBootApplication
public class SpringsecurityJwtApplication {

	

	@Autowired
	private UserRepository repository;
	
@PostConstruct
	public void initUsers() {
	int id;
	String UserName;
	String Password;
	String email;
	List<User> users = Stream.of(
			   new User(id: 101, UserName: "riya", Password:"prt", email:"user1@gmail")
			new User(id: 101, UserName: "maya", Password:"prti", email:"user2@gmail")
			new User(id: 101, UserName:"sid", Password:"prt", email:"users1@gmail")
			new User(id: 101, UserName:"reese", Password:"prt", email:"userr1@gmail")
			).collect(Collectors.toList());
	repository.saveAll(users);
					
	}
	
private String email(String string) {
	
	return null;
}

public static void main(String[] args) {
		SpringApplication.run(SpringsecurityJwtApplication.class, args);
	}

}
