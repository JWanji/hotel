package com.demo.hotel.service;

import java.util.List;

import com.demo.hotel.model.Customer;

public interface CustomerService {
	
	public List<String> getFeedbacks() throws Exception;
	
	public void addFeedback(Customer customer);
	
	public void contactUs(Customer customer);

}
