package com.demo.hotel.service;

import com.demo.hotel.model.Hotel;

public interface HotelService {
	public Hotel getHotelBylocation(String location) throws Exception;
}
