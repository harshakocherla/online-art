package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.art.online.models.ArtistAddress;

@Repository
public interface ArtistAddressRepository extends JpaRepository<ArtistAddress, Long> {

	@Query(value = "INSERT INTO artist_address(artist_id) VALUES(?1)", nativeQuery = true)
	void saveAddress(long artist_id);

}
