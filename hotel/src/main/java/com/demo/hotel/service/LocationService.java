package com.demo.hotel.service;

import java.util.List;

import com.demo.hotel.model.Location;

public interface LocationService {
	public List<String> getLocations() throws Exception;
	
	public List<Location> getAllLocations() throws Exception;
}
