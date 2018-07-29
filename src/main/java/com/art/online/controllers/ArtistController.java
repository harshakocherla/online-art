package com.art.online.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.art.online.models.Artist;
import com.art.online.models.ArtistAddress;
import com.art.online.service.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {
	
	@Autowired
	ArtistService artistService;
	
	//Add artist
	@PostMapping("/addArtist")
	@ResponseBody
	public String addArtist(@Valid @RequestBody Artist artist) {
		artistService.addArtist(artist);
		return "Artist Details Saved successfully.....";
	}
	
	//Get artists
	@GetMapping("/getAllArtists")
	public List<Artist> getAllArtists() {
		return artistService.getAllArtists();
	}
	
	
	@GetMapping("/getAllArtistsAddress")
	public List<ArtistAddress> getAllArtistsAddress(){
		return artistService.getAllArtistsAddress();
	}

}
