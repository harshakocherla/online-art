package com.art.online.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.online.models.Customer;
import com.art.online.models.CustomerAddress;
import com.art.online.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@Valid @RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/addCustomerAddress")
	public @Valid CustomerAddress addCustomerAddress(@Valid @RequestBody CustomerAddress customerAddress) {
		return customerService.addCustomerAddress(customerAddress);
	}
	
	@GetMapping("/getCustomerAddress")
	public List<CustomerAddress> getAllCustomersAddress(){
		return customerService.getAllCustomersAddress();
	}
}
