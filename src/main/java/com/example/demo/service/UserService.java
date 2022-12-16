package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

public interface UserService {


public  User saveUser(User user);

public User getUserById(Integer id);

public void deleteById(Integer id);

public List<User> getUserByCity(String city);

}
