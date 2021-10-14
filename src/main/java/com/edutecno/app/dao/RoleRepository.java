package com.edutecno.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.app.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	List<Role> findAll();
	
	List<Role> findByName(String name);

}
