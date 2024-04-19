package storage;

import java.util.HashMap;
import java.util.Map;

import model.Bookings;

public class BookingStorage {
 private static Map<String,Bookings> bookings;
	
	public static Map<String,Bookings>  getAllBookings(){
		if(bookings==null) {
			return new HashMap<>();
		}
		return bookings;
	}      
}
