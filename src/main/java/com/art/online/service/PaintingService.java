package com.art.online.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.online.models.Painting;
import com.art.online.repositories.PaintingRepository;

@Service
public class PaintingService {
	
	@Autowired
	PaintingRepository paintingRepository;

	public Painting addPainting(@Valid Painting painting) {
		// TODO Auto-generated method stub
		return paintingRepository.save(painting);
	}

	public List<Painting> getAllPaintings() {
		// TODO Auto-generated method stub
		return paintingRepository.findAll();
	}

}
