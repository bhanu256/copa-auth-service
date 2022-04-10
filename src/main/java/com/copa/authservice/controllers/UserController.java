package com.copa.authservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copa.authservice.entity.Users;
import com.copa.authservice.models.UserDTO;
import com.copa.authservice.repository.UserRepository;

@RestController()
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("signup")
	public void valid(@RequestBody UserDTO user) {
		userRepository.saveAndFlush(new Users(user.getUsername(), user.getPassword(), user.getEmail()));
	}

}
