package com.example.SpringBootUserCrudApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class apiViewController {

    @GetMapping("/menu")
    public String apiPage(){

        return "crudAPI.html";
    }
}
