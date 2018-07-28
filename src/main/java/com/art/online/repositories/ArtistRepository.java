package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
