package com.example.SpringBootUserCrudApi.service;


import com.example.SpringBootUserCrudApi.dao.CustomerRepository;
import com.example.SpringBootUserCrudApi.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	public CustomerServiceImpl(final CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Customer findById(int theId) {
		Optional<Customer> result = customerRepository.findById(theId);

		if (result.isPresent()) {
			return result.get();
		} else {
			// we didn't find the customer
			throw new RuntimeException("Did not find customer id - " + theId);
		}
	}
		@Override
		public void save(Customer theCustomer) {
			customerRepository.save(theCustomer);
		}

		@Override
		public void deleteById(int theId) {
			customerRepository.deleteById(theId);
		}

}
