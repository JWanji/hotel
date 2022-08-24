package com.demo.hotel.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.hotel.model.Hotel;
import com.demo.hotel.repository.HotelRepository;

@Transactional
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel getHotelBylocation(String location) throws Exception {
		Iterator<Hotel> it = hotelRepository.findAll().iterator();
		while (it.hasNext()) {
			Hotel hotel = it.next();
			if (hotel.getLocation().getLocationName().matches(location)) {
				return hotel;
			}
		}
		throw new Exception("No Hotel at this location");
	}
}
