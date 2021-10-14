package com.edutecno.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.app.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>{
	
	List<Rating> findAll();

}
