package com.example.SpringBootUserCrudApi.controller;


import com.example.SpringBootUserCrudApi.model.Customer;
import com.example.SpringBootUserCrudApi.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class customerController {

    private final CustomerService customerService;

    public customerController(final CustomerService theCustomerService){
        this.customerService = theCustomerService;
    }

    @GetMapping("/list")
    public String listCustomers(final Model theModel){
            theModel.addAttribute("customers",customerService.findAll());
            return "main-menu-list.html";
    }

    @GetMapping("/createCustomer")
    public String createCustomer(final Model theModel){
        theModel.addAttribute("customer",new Customer());
        return "createCustomer.html";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId")int theId){
        customerService.deleteById(theId);
        return "redirect:/customers/list";
    }

    @GetMapping("/update")
    public String updateCustomer(@RequestParam("customerId")int theId, final Model theModel){
        theModel.addAttribute("customer",customerService.findById(theId));
        return "createCustomer.html";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") final Customer theCustomer){
        customerService.save(theCustomer);
        return "redirect:/customers/list";
    }
}