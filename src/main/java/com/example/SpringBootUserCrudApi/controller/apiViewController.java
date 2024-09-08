package com.example.SpringBootUserCrudApi.controller;

import com.example.SpringBootUserCrudApi.model.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class apiViewController {

    @GetMapping("/menu")
    public String apiPage(){
        return "crudAPI.html";
    }

    @GetMapping("/login")
    public String loginPage(final Model theModel){
        Manager manager = new Manager();
        theModel.addAttribute("manager",manager);
        return "logIn.html";
    }
}
