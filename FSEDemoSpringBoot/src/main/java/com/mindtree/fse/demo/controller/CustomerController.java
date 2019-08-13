/**
 * 
 */
package com.mindtree.fse.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.fse.demo.entities.Customer;
import com.mindtree.fse.demo.repository.CustomerRepository;

/**
 * @author M1031960
 *
 */
@RestController
@RequestMapping(path = "/customers")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping(path = "/")
	public List<Customer> getAllCustomers(){
		
		return customerRepository.findAll();
		
	}
	
	@PostMapping("/")
	public Customer createNote(@Valid @RequestBody Customer customer) {
	    return customerRepository.save(customer);
	}
	
}
