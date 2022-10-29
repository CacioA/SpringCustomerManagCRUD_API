package com.example.SpringBootUserCrudApi.dao;

import com.example.SpringBootUserCrudApi.model.Customer;
import com.example.SpringBootUserCrudApi.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {

    @Query(value = "SELECT * FROM manager WHERE email LIKE %?1%", nativeQuery = true)
    public Manager getByEmail(String email);
}
