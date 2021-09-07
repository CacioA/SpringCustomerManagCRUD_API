package com.example.SpringBootUserCrudApi.service;


//import com.example.SpringBootUserCrudApi.dao.CustomerDAO;
import com.example.SpringBootUserCrudApi.dao.CustomerRepository;
import com.example.SpringBootUserCrudApi.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

	//	CHECK THE OTHER PROJECT AND MAKE SURE EVERYTHING IS UP TO DATE IN CUSTOMER SERVICE, IMPL AND REPOSITORY

	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository theCustomerRepository){
		customerRepository = theCustomerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Customer findById(int theId) {
		Optional<Customer> result = customerRepository.findById(theId);

		Customer theCustomer = null;

		if (result.isPresent()) {
			theCustomer = result.get();
		} else {
			// we didn't find the customer
			throw new RuntimeException("Did not find customer id - " + theId);
		}
		return theCustomer;
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
