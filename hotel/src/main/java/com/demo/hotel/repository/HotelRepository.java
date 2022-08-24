package com.demo.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.hotel.model.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {

	
}
