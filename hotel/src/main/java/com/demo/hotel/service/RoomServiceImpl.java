package com.demo.hotel.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.hotel.model.Rooms;
import com.demo.hotel.repository.RoomsRepository;

@Transactional // to commit or roll back DB transactions in case of success or exception
				// respectively
@Service // TO register this class as a service bean
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomsRepository roomRepository;

	@Override
	public List<Rooms> getAllRooms() throws Exception {
		List<Rooms> roomList = new ArrayList<>();
		Iterator<Rooms> it = roomRepository.findAll().iterator();
		while (it.hasNext()) {
			roomList.add(it.next());
		}

		if (roomList.isEmpty())
			throw new Exception("No Rooms Types");
		return roomList;
	}
}
