package com.art.online.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.online.models.Artist;
import com.art.online.models.ArtistAddress;
import com.art.online.repositories.ArtistAddressRepository;
import com.art.online.repositories.ArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	ArtistRepository artistRepository;
	
	@Autowired
	ArtistAddressRepository artistAddressRepository;

	public Artist addArtist(@Valid Artist artist) {
		
		return artistRepository.save(artist);
	}

	public List<Artist> getAllArtists() {
		
		return artistRepository.findAll();
	}

	public @Valid ArtistAddress addArtistAddress(@Valid ArtistAddress artistAddress) {
		// TODO Auto-generated method stub
		return artistAddressRepository.save(artistAddress);
	}

	public List<ArtistAddress> getAllArtistsAddress() {
		// TODO Auto-generated method stub
		return artistAddressRepository.findAll();
	}

}
