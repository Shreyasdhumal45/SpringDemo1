package com.example.demo.controller;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;



@RestController
@RequestMapping("/user")
public class UserControl {
	
	@Autowired
	private UserService userservice;
	 
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		
		User use=userservice.saveUser(user);
		return ResponseEntity.ok().body(use);
		
		}
	@GetMapping("/get/{id}")
public ResponseEntity<User> getUserById(@PathVariable("id") Integer id  ){
	
	User use =userservice.getUserById(id);
	       
	return ResponseEntity.ok().body(use);
	
}
	@DeleteMapping("/delete/{id}")
public void deleteUserById(@PathVariable("id") Integer id) {
	
  userservice.deleteById(id);
	 
	}
	@GetMapping("get/{city}")
	public ResponseEntity< List<User> >getUserByCity(@PathVariable("city")String city){
		List<User> use=userservice.getUserByCity(city);
	
		return ResponseEntity.ok().body(use);
		
	}
	
}
