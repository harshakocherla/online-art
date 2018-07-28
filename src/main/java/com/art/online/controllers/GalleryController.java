package com.art.online.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.online.models.Gallery;
import com.art.online.models.GalleryAddress;
import com.art.online.service.GalleryService;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

	@Autowired
	GalleryService galleryService;
	
	@PostMapping("/addGallery")
	public Gallery addGallery(@Valid @RequestBody Gallery gallery) {
		return galleryService.addGallery(gallery);
	}
	
	@GetMapping("/getGallery")
	public List<Gallery> getAllGallerys(){
		return galleryService.getAllGallerys();
	}
	
	@PostMapping("/addGalleryAddress")
	public @Valid GalleryAddress addGalleryAddress(@Valid @RequestBody GalleryAddress galleryAddress) {
		return galleryService.addGalleryAddress(galleryAddress);
	}
	
	@GetMapping("/getGalleryAddress")
	public List<GalleryAddress> getAllGallerysAddress(){
		return galleryService.getAllGallerysAddress();
	}
}
