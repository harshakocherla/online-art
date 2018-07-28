package com.art.online.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.online.models.Painting;
import com.art.online.service.PaintingService;

@RestController
@RequestMapping("/painting")
public class PaintingController {

	@Autowired
	PaintingService paintingService;
	
	//Add painting details
	@PostMapping("/addPainting")
	public Painting addPainting(@Valid @RequestBody Painting painting) {
		return paintingService.addPainting(painting);
	}
	
	//Get painting details
	@GetMapping("/getAllPaintings")
	public List<Painting> getAllPaintings() {
		return paintingService.getAllPaintings();
	}
}
