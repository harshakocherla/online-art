package com.art.online.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.online.models.Exhibition;
import com.art.online.repositories.ExhibitionRepository;

@Service
public class ExhibitionService {
	
	@Autowired
	ExhibitionRepository exhibitionRepository;

	public Exhibition addExhibition(@Valid Exhibition exhibition) {
		// TODO Auto-generated method stub
		return exhibitionRepository.save(exhibition);
	}

	public List<Exhibition> getAllExhibitions() {
		// TODO Auto-generated method stub
		return exhibitionRepository.findAll();
	}

}
