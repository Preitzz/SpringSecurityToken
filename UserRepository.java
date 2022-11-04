package com.spring.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springsecurityjwt.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUserName(String username);

}
