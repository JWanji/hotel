package com.demo.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL_LOCATIONS")
public class Location {

	@Id
	private Integer locationId;
	private String locationName;

	public Location() {
	}

	public Location(Integer locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}