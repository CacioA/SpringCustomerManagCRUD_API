package com.example.SpringBootUserCrudApi.service;

import com.example.SpringBootUserCrudApi.model.Manager;

public interface ManagerService {

   Manager getManager(String email, String password);
}
