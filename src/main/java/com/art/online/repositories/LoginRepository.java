package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

}
