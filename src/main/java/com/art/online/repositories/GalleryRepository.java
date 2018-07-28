package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.Gallery;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}
