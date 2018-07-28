package com.art.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.online.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
