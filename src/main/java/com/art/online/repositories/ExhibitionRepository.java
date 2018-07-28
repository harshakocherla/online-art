package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.Exhibition;

@Repository
public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {

}
