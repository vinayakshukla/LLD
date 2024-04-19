package Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Flight;

public class FlightRepo {
	public static Map<Long, Flight> flights = new HashMap<>();

	public static void addFlight(Flight flight) {
		flights.put(flight.getId(), flight);

		System.out.println(flights);
	}

	public static List<Flight> getAllFlight() {
		return flights.values().stream().collect(Collectors.toList());
	}

	public static Flight getFlightById(long flightNumber) {
		if (flights.containsKey(flightNumber)) {
			return flights.get(flightNumber);
		}
		return null;
	}
}
