package com.demo.hotel.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hotel.model.Customer;
import com.demo.hotel.model.Hotel;
import com.demo.hotel.model.Rooms;
import com.demo.hotel.service.CustomerService;
import com.demo.hotel.service.HotelService;
import com.demo.hotel.service.LocationService;
import com.demo.hotel.service.RoomService;

@RestController
@RequestMapping(value = "hotel")

@CrossOrigin
public class HotelApplicationController {
	
	private static final Log LOGGER = LogFactory.getLog(HotelApplicationController.class);

	@Autowired
	private RoomService roomService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private LocationService locationService;

	@Autowired
	private HotelService hotelService;

	
	

	@GetMapping(value = "/locations")
	public List<String> getLocations() throws Exception {
		LOGGER.info("get Locaitons invoked");
		return locationService.getLocations();
	}

	@GetMapping(value = "/hotel/{location}")
	public Hotel getHotelByLocation(@PathVariable String location) throws Exception {
		LOGGER.info("get Hotel By  Locaitons invoked with location:"+location);
		return hotelService.getHotelBylocation(location);
	}

	@GetMapping(value = "/feedback")
	public List<String> getFeedbacks() throws Exception {
		LOGGER.info("Get Feedbacks invoked");
		return customerService.getFeedbacks();
	}

	@PostMapping(value = "/feedback")
	public String addFeedback(@RequestBody Customer customer) throws Exception {
		customerService.addFeedback(customer);
		LOGGER.info("Add Feedbacks invoked");
		return "Thank You for providing your feedback";
	}

	@PostMapping(value = "/contact")
	public String contactUs(@RequestBody Customer customer) throws Exception {
		customerService.contactUs(customer);
		LOGGER.info("Add Contact invoked");
		return "Thank You for contacting us.";
	}

}
