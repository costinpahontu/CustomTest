package com.custom.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {


    @Query("select id from Customer c where c.email =?1")
    Long findByEmail(String email);

}
