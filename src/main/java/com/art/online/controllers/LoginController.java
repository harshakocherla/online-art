package com.art.online.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.online.models.Login;
import com.art.online.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	//Add login details
	@PostMapping("/addLogin")
	public Login addLogin(@Valid @RequestBody Login login) {
		return loginService.addLogin(login);
	}
	
	//Get login details
	@GetMapping("/getAllLogins")
	public List<Login> getAllLogins() {
		return loginService.getAllLogins();
	}

}
