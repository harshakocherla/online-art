package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.ArtistAddress;

@Repository
public interface ArtistAddressRepository extends JpaRepository<ArtistAddress, Long> {

}
