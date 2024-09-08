package com.example.SpringBootUserCrudApi.service;

import com.example.SpringBootUserCrudApi.dao.ManagerRepository;
import com.example.SpringBootUserCrudApi.model.Manager;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService{

    private final ManagerRepository managerRepository;

    public ManagerServiceImpl(final ManagerRepository theManagerRepository){
        managerRepository = theManagerRepository;
    }

    @Override
    public Manager getManager(String email, String password) {
       return managerRepository.getByEmail(email);
    }
}
