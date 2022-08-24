package com.demo.hotel.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM_TYPE")
public class Rooms {

	@Id
	private Integer roomId;
	@Enumerated(EnumType.STRING)
	private RoomType roomType;
	private Integer costPerPerson;

	public Rooms() {
		// TODO Auto-generated constructor stub
	}

	public Rooms(Integer roomId, RoomType roomType, Integer costPerPerson) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.costPerPerson = costPerPerson;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public Integer getCostPerPerson() {
		return costPerPerson;
	}

	public void setCostPerPerson(Integer costPerPerson) {
		this.costPerPerson = costPerPerson;
	}
}