package com.example.demoelasticsearch;

import com.example.demoelasticsearch.model.Customer;
import com.example.demoelasticsearch.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoElasticsearchApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void elasticCrudOperationsTest() {
        customerRepository.deleteAll();
        customerRepository.save(new Customer("1","Sunil", "Keyal"));
        customerRepository.save(new Customer("2","John", "Doe"));
        customerRepository.save(new Customer("3","John", "Keyal"));
        customerRepository.save(new Customer());
        assertEquals(4, customerRepository.count());
        assertTrue(customerRepository.existsById("1"));
        assertNotNull(customerRepository.findCustomerByFirstName("Sunil"));
        assertNull(customerRepository.findCustomerByFirstName("Does Not Exist"));

    }

}
