package com.demo.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.hotel.model.Rooms;

public interface RoomsRepository extends CrudRepository<Rooms, Integer> {

}
