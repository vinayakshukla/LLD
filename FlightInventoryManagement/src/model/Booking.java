package model;

import java.util.*;

import Repository.BookingRepo;
import model.*;

public class Booking {
	long id;
	String userId;
	long flightId;
	int seats;
	String fareType;
	List<String> bookedSeats;

	public Booking(String userId, long flightId, int seats, String fareType, List<String> bookedSeats) {
		super();
		this.id = BookingRepo.bookings.size();
		this.userId = userId;
		this.flightId = flightId;
		this.seats = seats;
		this.fareType = fareType;
		this.bookedSeats = bookedSeats;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public List<String> getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(List<String> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

}
