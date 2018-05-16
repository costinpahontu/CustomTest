package com.custom.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override

    public Customer addNew(Customer customer) {


        //check if email is unique
        Long foundCustomerWithEmail = customerRepo.findByEmail(customer.getEmail());

        if(foundCustomerWithEmail == null){
            return customerRepo.save(customer);
        }else{
            customer.setId(foundCustomerWithEmail);
           return customerRepo.save(customer);
        }


    }

    @Override
    public List<Customer> listAll() {
        return customerRepo.findAll();
    }

}
