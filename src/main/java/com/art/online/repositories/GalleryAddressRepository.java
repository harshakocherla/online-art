package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.GalleryAddress;

@Repository
public interface GalleryAddressRepository extends JpaRepository<GalleryAddress, Long> {

}
