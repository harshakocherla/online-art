package com.art.online.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.online.models.Gallery;
import com.art.online.models.GalleryAddress;
import com.art.online.repositories.GalleryAddressRepository;
import com.art.online.repositories.GalleryRepository;

@Service
public class GalleryService {

	@Autowired
	GalleryRepository galleryRepository;
	
	@Autowired
	GalleryAddressRepository galleryAddressRepository;
	
	public Gallery addGallery(@Valid Gallery gallery) {
		// TODO Auto-generated method stub
		return galleryRepository.save(gallery);
	}

	public List<Gallery> getAllGallerys() {
		// TODO Auto-generated method stub
		return galleryRepository.findAll();
	}

	public @Valid GalleryAddress addGalleryAddress(@Valid GalleryAddress galleryAddress) {
		// TODO Auto-generated method stub
		return galleryAddressRepository.save(galleryAddress);
	}

	public List<GalleryAddress> getAllGallerysAddress() {
		// TODO Auto-generated method stub
		return galleryAddressRepository.findAll();
	}

}
