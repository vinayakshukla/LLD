package view;

import java.util.List;

import Repository.BookingRepo;
import Repository.FlightRepo;
import model.Booking;
import service.BookingService;

public class BookingView {
	public BookingService bookingService= new BookingService();

	public boolean addBooking(String userId,String from, String to, long flightNumber, String airline,String departDate, String fareType, List<String> seats) {
		
		Booking booking = new Booking(userId,flightNumber,seats.size(), fareType, seats);
		bookingService.bookFlight(booking);
		return true;
	}
}
