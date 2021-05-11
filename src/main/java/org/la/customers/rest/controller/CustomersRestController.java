package org.la.customers.rest.controller;

import java.util.List;

import org.la.customers.model.CustomersModel;
import org.la.customers.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersRestController {
	
	@Autowired
	private CustomersService customersService;
	
	@GetMapping("/findAll")
	public List<CustomersModel> findAll() {
		return customersService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public CustomersModel findById(@PathVariable Long id) {
		return customersService.findById(id);
		
	}
	
}
