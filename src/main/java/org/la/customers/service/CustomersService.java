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


	public CustomersModel findById(Long id) {
		CustomersModel  customersModel = customersRepository.findById(id).get();
		return customersModel; 
	}


	public CustomersModel add(CustomersModel customersModel) {
		return customersRepository.save(customersModel);
	}


	public String findAgeById(Long id) {
		CustomersModel customers = customersRepository.findById(id).get();
		if(customers.getAge() > 18) {
			return "adult";
	} else {
		return "kid";
	}	
}


	public CustomersModel findByName(String name) {
		CustomersModel customersModel = customersRepository.findByName(name);
		return customersModel;
	}


	public void delete(Long id) {
		customersRepository.deleteById(id);
	}


	public CustomersModel update(Long id, CustomersModel customersModel) {
		CustomersModel cust = customersRepository.findById(id).orElse(null);
		cust.setName(customersModel.getName());
		cust.setAge(customersModel.getAge());
		cust.setEmail(customersModel.getEmail());
		cust.setPhoneNumber(customersModel.getPhoneNumber());
		customersModel = customersRepository.save(cust);
		return customersModel;
	}

	
	

}
