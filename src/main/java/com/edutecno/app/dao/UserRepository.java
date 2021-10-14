package com.edutecno.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findAll();
	
	User findByUsername(String username);
	
	User findByEmail(String email);
}
