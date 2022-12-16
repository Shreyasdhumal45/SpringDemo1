package com.example.demo.serviceImpl;

import java.util.List;

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

	@Override
	public User getUserById(Integer id){
	
		return userRepo.getById(id);
		
	}

	@Override
	public void deleteById(Integer id) {
	
		userRepo.deleteById(id);
		
	}

	@Override
	public List<User> getUserByCity(String city) {
		
		return userRepo.getUserByCity(city);
	}

	

	

	

	

}
