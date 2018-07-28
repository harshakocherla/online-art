package com.art.online.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.online.models.Exhibition;
import com.art.online.service.ExhibitionService;

@RestController
@RequestMapping("/exhibition")
public class ExhibitionController {

	@Autowired
	ExhibitionService exhibitionService;
	
	//Add exhibition details
	@PostMapping("/addExhibition")
	public Exhibition addExhibition(@Valid @RequestBody Exhibition exhibition) {
		return exhibitionService.addExhibition(exhibition);
	}
	
	//Get exhibition details
	@GetMapping("/getExhibition")
	public List<Exhibition> getAllExhibitions() {
		return exhibitionService.getAllExhibitions();
	}
}
