package model;

import java.util.*;

import Repository.FlightRepo;

public class Flight {
	long id;
	String airLine;
	String from;
	String to;
	FlightDate departDate;
//     assuming arrival date is also required
	FlightDate arrivalDate;
	List<Fare> fares = new ArrayList<>();

	List<Seat> seats = new ArrayList<>();

	public Flight(String airLine, String from, String to, FlightDate departDate, FlightDate arrivalDate,
			List<Fare> fares) {
		super();
		this.id = FlightRepo.flights.size();
		this.airLine = airLine;
		this.from = from;
		this.to = to;
		this.departDate = departDate;
		this.arrivalDate = arrivalDate;
		this.fares = fares;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public FlightDate getDepartDate() {
		return departDate;
	}

	public void setDepartDate(FlightDate departDate) {
		this.departDate = departDate;
	}

	public FlightDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(FlightDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public List<Fare> getFares() {
		return fares;
	}

	public void setFares(List<Fare> fares) {
		this.fares = fares;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", airLine=" + airLine + ", from=" + from + ", to=" + to + ", departDate="
				+ departDate + ", arrivalDate=" + arrivalDate + ", fares=" + fares + "]";
	}

}
