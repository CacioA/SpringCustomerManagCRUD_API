package com.example.SpringBootUserCrudApi;

import com.example.SpringBootUserCrudApi.entity.Customer;
import com.example.SpringBootUserCrudApi.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootUserCrudApiApplicationTests {

	@Test
	void contextLoads() {
	}



//	@Test
//	public void testDBConnection() {
//
//		Customer customer = customerService.findById(1);
//
//		assertEquals("Toni",customer.getFirstName());
//
//	}
//
//	@Test
//	public void getAllCustomers(){
//		System.out.println(customerService.findById(1).getFirstName());
//		System.out.println(customerService.findById(1).getEmail());
//	}
}

