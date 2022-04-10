package com.copa.authservice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "auth")
public class AuthController {
	
	@PostMapping("verify")
	public boolean verifyUser() {
		return true;
	}

}
