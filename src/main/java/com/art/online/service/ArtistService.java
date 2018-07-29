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
		
		
		for(ArtistAddress artistAddress: artist.getArtistAddress()) {
			artistAddress.setArtist(artist);
			artistAddressRepository.save(artistAddress);
		}
		Artist artistDetails = artistRepository.save(artist);
		
		
		return artistDetails;
	}

	public List<Artist> getAllArtists() {
		
		return artistRepository.findAll();
	}

	public List<ArtistAddress> getAllArtistsAddress() {
		// TODO Auto-generated method stub
		return artistAddressRepository.findAll();
	}

}
