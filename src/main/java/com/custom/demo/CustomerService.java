package com.custom.demo;

import java.util.List;

public interface CustomerService {
    Customer addNew(Customer customer);
    List<Customer> listAll();
}
