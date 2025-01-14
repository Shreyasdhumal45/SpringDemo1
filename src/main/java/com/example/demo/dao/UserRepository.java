package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Object>  {

	@Query(value= "select * from Shreyas c where city=?1" , nativeQuery = true )
	
	public List<User> getUserByCity(String city);
	
} 
