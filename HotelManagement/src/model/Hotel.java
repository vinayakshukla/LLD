package model;

import java.util.List;

public class Hotel {
	String id;
	String name;	
	String address;
	List<Rooms> roomsList;
	
	public Hotel(String id, String name, String address, List<Rooms> roomsList) {
		super();
		this.id = id;
		this.name=name;
		this.address = address;
		this.roomsList = roomsList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Rooms> getRoomsList() {
		return roomsList;
	}
	public void setRoomsList(List<Rooms> roomsList) {
		this.roomsList = roomsList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
