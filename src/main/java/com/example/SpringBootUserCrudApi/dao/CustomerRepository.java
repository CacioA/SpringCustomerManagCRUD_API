package com.example.SpringBootUserCrudApi.dao;

import com.example.SpringBootUserCrudApi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // sort by last name
    public List<Customer> findAllByOrderByLastNameAsc();
}
