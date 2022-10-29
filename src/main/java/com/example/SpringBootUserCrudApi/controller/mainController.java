package com.example.SpringBootUserCrudApi.controller;


import com.example.SpringBootUserCrudApi.model.Customer;
import com.example.SpringBootUserCrudApi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class mainController {


    private CustomerService customerService;

    public mainController(CustomerService theCustomerService){
        customerService=theCustomerService;
    }

    @GetMapping("/list")
    public String listCustomers(Model theModel){
            List<Customer> theCustomers = customerService.findAll();

            theModel.addAttribute("customers",theCustomers);

            return "main-menu-list.html";
    }

    @GetMapping("/createCustomer")
    public String createCustomer(Model theModel){
        Customer customer = new Customer();

        theModel.addAttribute("customer",customer);
        return "createCustomer.html";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId")int theId){
        customerService.deleteById(theId);

        return "redirect:/customers/list";
    }

    @GetMapping("/update")
    public String updateCustomer(@RequestParam("customerId")int theId,
                                 Model theModel){

        Customer customer = customerService.findById(theId);

        theModel.addAttribute("customer",customer);

        return "createCustomer.html";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer")Customer theCustomer){
        customerService.save(theCustomer);

        return "redirect:/customers/list";
    }




}
