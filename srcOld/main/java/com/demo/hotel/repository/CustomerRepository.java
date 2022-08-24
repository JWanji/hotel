package com.demo.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.hotel.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
