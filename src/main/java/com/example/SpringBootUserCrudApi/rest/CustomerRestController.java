package com.example.SpringBootUserCrudApi.rest;

import com.example.SpringBootUserCrudApi.model.Customer;
import com.example.SpringBootUserCrudApi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){

    return customerService.findAll();
}


    @GetMapping("/customers/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){

        Customer customer = customerService.findById(customerId);

        if(customer == null){
            throw new CustomerNotFoundException("Customer with id "+customerId+" not found");
        }
        return customer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer){

        // set id to 0 to force a new save instead of update

        theCustomer.setId(0);

        customerService.save(theCustomer);

        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer){
        customerService.save(theCustomer);

        return theCustomer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){

        Customer customer  = customerService.findById(customerId);

        if(customer == null){
            throw new CustomerNotFoundException("Customer with id "+customerId+" was not found");
        }
        customerService.deleteById(customerId);

        return "Customer with id "+customerId+" has been deleted";
    }

}
