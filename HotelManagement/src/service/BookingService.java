package service;

import java.util.Map;

import model.Bookings;
import storage.BookingStorage;

public class BookingService {
	
	Map<String,Bookings> bookings = BookingStorage.getAllBookings();
	public boolean bookSlot(String hotelId, int roomId, int date, int duration,  String roomType){
		
	    for(String key: bookings.keySet()) {
	        Bookings existingBooking = bookings.get(key);
	        if(existingBooking.getHotelId().equals(hotelId) && existingBooking.getrNo()==roomId && (existingBooking.getStartDate()+existingBooking.getDuration())>date) {
	        	return false;
	        }
	        
	    }
//	    public Bookings(String bookingId, String hotelId, int rNo, int duration, int startDate) {
//	    roomNo calculation by roomType
		Bookings newBooking= new Bookings(bookings.size()+"", hotelId , roomId, duration, date);
		bookings.put(bookings.size()+"", newBooking);
		return true;
	}
	public void cancelBooking(String bookingId) {
		bookings.remove(bookingId);
	}
}
