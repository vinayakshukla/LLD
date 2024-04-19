package service;

import java.util.List;
import java.util.stream.Collectors;

import Repository.BookingRepo;
import Repository.FlightRepo;
import model.*;

public class BookingService {
//	loosly coupling
	UserService userService = new UserService();

	public boolean bookFlight(Booking booking) {
//		to-do validationException 
//		to-do seperate validationMethod to add
		if (booking == null) {
			System.out.println("Empty booking found");
			return false;
		}
		Flight flight = FlightRepo.getFlightById(booking.getFlightId());
		if (flight == null) {
			System.out.println("FlightId not found");
			return false;
		}

		List<Fare> fare = flight.getFares().stream().filter(e -> e.getFareType().equals(booking.getFareType()))
				.collect(Collectors.toList());
		if (fare == null || fare.isEmpty()) {
			System.out.println("Fare type not found");
			return false;

		}
		double requiredFund = fare.get(0).getPrice() * booking.getSeats();

		User user = userService.getUserById(booking.getUserId());
		if (requiredFund > user.getFund()) {
			System.out.println("Insufficient funds");
			return false;
		}

		for (Seat s : fare.get(0).getSeats()) {
			if (booking.getBookedSeats().contains(s.getId()) && s.getStatus() == Status.Booked) {
				System.out.println("One or more selected seats booked");
				return false;
			}

		}

		BookingRepo.addBooking(booking);
		for (Seat s : fare.get(0).getSeats()) {
			if (booking.getBookedSeats().contains(s.getId())) {
				s.setStatus(Status.Booked);
			}

		}
		user.setFund(user.getFund() - requiredFund);

		return true;
	}
}
