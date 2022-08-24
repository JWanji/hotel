package com.demo.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.hotel.model.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
