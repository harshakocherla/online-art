package com.art.online.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.art.online.models.Login;
import com.art.online.repositories.LoginRepository;

@Repository
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	
	public Login addLogin(@Valid Login login) {
		// TODO Auto-generated method stub
		return loginRepository.save(login);
	}


	public List<Login> getAllLogins() {
		// TODO Auto-generated method stub
		return loginRepository.findAll();
	}

}
