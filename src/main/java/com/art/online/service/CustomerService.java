package com.art.online.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.online.models.Customer;
import com.art.online.models.CustomerAddress;
import com.art.online.repositories.CustomerAddressRepository;
import com.art.online.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerAddressRepository customerAddressRepository;

	public @Valid Customer addCustomer(@Valid Customer customer) {
		
		return customerRepository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	public @Valid CustomerAddress addCustomerAddress(@Valid CustomerAddress customerAddress) {
		
		return customerAddressRepository.save(customerAddress);
	}

	public List<CustomerAddress> getAllCustomersAddress() {
		
		return customerAddressRepository.findAll();
	}

}
