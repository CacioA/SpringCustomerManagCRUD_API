package com.example.SpringBootUserCrudApi.controller;

import com.example.SpringBootUserCrudApi.dao.ManagerRepository;
import com.example.SpringBootUserCrudApi.model.Manager;
import com.example.SpringBootUserCrudApi.service.CustomerServiceImpl;
import com.example.SpringBootUserCrudApi.service.ManagerService;
import com.example.SpringBootUserCrudApi.service.ManagerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/managers")
public class managerController {

    private ManagerService managerService;

    public managerController(final ManagerService theManagerService) {
        this.managerService = theManagerService;
    }

    @GetMapping("/home")
    public String managerHome(final Model theModel){

        theModel.addAttribute("manager",new Manager());
        return "logIn.html";
    }

    @GetMapping("/login")
    public String managerlogin(String email, String password){
        return managerService.getManager(email,password).getFirstName();
    }
}

