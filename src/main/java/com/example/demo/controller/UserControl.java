package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
		
	}}
		

