package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@Service	
public class UserServiceImpl implements UserService {
@Autowired
	private UserRepository userRepo;
	
	@Override
	public User saveUser(User user) {
		
		return userRepo.save(user);
	}

}
