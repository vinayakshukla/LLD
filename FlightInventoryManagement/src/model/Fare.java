package model;

import java.util.*;

public class Fare {
	String fareType;
	double price;
	List<Seat> seats;

	public Fare(String fareType, double price, List<Seat> seats) {
		super();
		this.fareType = fareType;
		this.price = price;
		this.seats = seats;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

}
