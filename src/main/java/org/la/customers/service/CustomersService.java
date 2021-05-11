package org.la.customers.service;

import java.util.List;

import org.la.customers.model.CustomersModel;
import org.la.customers.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

	@Autowired
	private CustomersRepository customersRepository;
	
	
	public List <CustomersModel> findAll() {
		List<CustomersModel> customersList = customersRepository.findAll();
		return customersList;
	}
	
	

}
