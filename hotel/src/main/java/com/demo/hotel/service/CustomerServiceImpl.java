package com.demo.hotel.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.hotel.model.Customer;
import com.demo.hotel.repository.CustomerRepository;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<String> getFeedbacks() throws Exception {
		List<String> msgs = new ArrayList<>();
		Iterator<Customer> it = customerRepository.findAll().iterator();
		while (it.hasNext()) {
			Customer cust = it.next();
			if (cust.getType().equals("Feedback")) {
				msgs.add(cust.getMessage());
			}
		}
		if (msgs.isEmpty())
			throw new Exception("No Feedback available");
		return msgs;
	}

	public void addFeedback(Customer customer) {
		Integer maxId = 0;
		Iterator<Customer> it = customerRepository.findAll().iterator();
		while (it.hasNext()) {
			Customer cust = it.next();
			if (customer.getCustomerId()!=null && customer.getCustomerId()> maxId) {
				maxId = customer.getCustomerId() +1;
			}
			customer.setCustomerId(maxId);
		}
		customer.setType("Feedback");
		customerRepository.save(customer);
	}

	public void contactUs(Customer customer) {
		Integer maxId = 0;
		Iterator<Customer> it = customerRepository.findAll().iterator();
		while (it.hasNext()) {
			Customer cust = it.next();
			if (customer.getCustomerId()!=null && customer.getCustomerId()> maxId) {
				maxId = customer.getCustomerId() +1;
			}
			customer.setCustomerId(maxId);
		}
		customer.setType("Contact");
		customerRepository.save(customer);
	}
}
