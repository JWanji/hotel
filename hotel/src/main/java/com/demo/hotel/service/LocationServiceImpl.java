package com.demo.hotel.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.hotel.model.Location;
import com.demo.hotel.repository.LocationRepository;

@Transactional
@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<String> getLocations() throws Exception {
		List<String> lcoationNames = new ArrayList<>();
		Iterator<Location> it = locationRepository.findAll().iterator();
		while (it.hasNext()) {
			lcoationNames.add(it.next().getLocationName());
		}
		if (lcoationNames.isEmpty())
			throw new Exception("No locations found");
		return lcoationNames;
	}

	@Override
	public List<Location> getAllLocations() throws Exception {
		List<Location> loc = new ArrayList<>();
		Iterator<Location> it = locationRepository.findAll().iterator();
		while (it.hasNext()) {
			loc.add(it.next());
		}
		if (loc.isEmpty())
			throw new Exception("No locations found");
		return loc;
	}

}
