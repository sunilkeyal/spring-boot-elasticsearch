package com.example.demoelasticsearch.repository;

import com.example.demoelasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    Customer findCustomerByFirstName(String firstName);
}
