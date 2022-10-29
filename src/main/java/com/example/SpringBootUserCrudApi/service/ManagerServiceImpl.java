package com.example.SpringBootUserCrudApi.service;

import com.example.SpringBootUserCrudApi.dao.CustomerRepository;
import com.example.SpringBootUserCrudApi.dao.ManagerRepository;
import com.example.SpringBootUserCrudApi.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService{

    ///@Autowired
    private ManagerRepository managerRepository;

    @Autowired
    public ManagerServiceImpl(ManagerRepository theManagerRepository){
        managerRepository = theManagerRepository;
    }

    @Override
    public Manager getManager(String email, String password) {
        System.out.println("EMAIL IS "+email);
       return managerRepository.getByEmail(email);
    }
}
