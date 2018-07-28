package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.Painting;

@Repository
public interface PaintingRepository extends JpaRepository<Painting, Long> {

}
