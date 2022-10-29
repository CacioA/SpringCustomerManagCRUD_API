package com.example.SpringBootUserCrudApi.service;



import com.example.SpringBootUserCrudApi.model.Customer;

import java.util.List;


public interface CustomerService {

	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer theCustomer);

	public void deleteById(int theId);
	
}
