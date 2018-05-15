package com.custom.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public List<Customer> addCustomer() {
        return customerService.listAll();
    }

    @PostMapping("/add")
    public Customer addNew(@Valid @RequestBody Customer customer) {
        return customerService.addNew(customer);
    }
}