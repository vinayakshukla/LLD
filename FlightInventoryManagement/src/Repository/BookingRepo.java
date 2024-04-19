package Repository;

import java.util.HashMap;
import java.util.*;

import model.*;

public class BookingRepo {
	public static Map<Long, Booking> bookings = new HashMap<>();

	public static void addBooking(Booking booking) {
		bookings.put(booking.getId(), booking);
	}
}
