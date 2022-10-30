package com.example.SpringBootUserCrudApi.service;

import com.example.SpringBootUserCrudApi.model.Manager;

public interface ManagerService {

    public Manager getManager(String email, String password);
}
