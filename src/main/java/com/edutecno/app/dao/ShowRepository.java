package com.edutecno.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.app.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{
	
	List<Show> findAll();

}
