package com.custom.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private CustomerService customerService;


    @Test
    public void contextLoads() {
        String defaultName = "test";
        Customer c = new Customer();
        c.setName(defaultName);
        c.setEmail("a@a.com");
        c.setLastName("test");
        c.setZipcode(12);

        //save a customer
        Customer savedC = customerService.addNew(c);
        //check if the email is saved
        Assert.assertEquals(savedC.getEmail(),c.getEmail());
        //check if the id is returned
        Assert.assertTrue(savedC.getId() != null);

        //change the name and save again
        c.setName("second");
        Customer savedSecondTime = customerService.addNew(c);
        //check that if the email is the same the values are updated
        Assert.assertNotEquals(savedSecondTime.getName(), defaultName);
        //check if it's the same email
        Assert.assertEquals(savedSecondTime.getEmail(),c.getEmail());



    }

}
