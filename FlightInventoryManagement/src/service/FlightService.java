package service;

import java.util.*;
import java.util.stream.Collectors;

import Repository.FlightRepo;
import dto.FlightDto;
import model.*;

public class FlightService {
	public List<FlightDto> searchFlight(String from, String to, int departDate, int paxCount) {

		List<Flight> partialResult = FlightRepo.getAllFlight().stream().filter(e -> {
			return e.getFrom().equals(from) && e.getTo().equals(to) && e.getDepartDate().getDate() == departDate;
		}).collect(Collectors.toList());

		if (partialResult == null || partialResult.isEmpty()) {
			return new ArrayList<>();
		}
		List<FlightDto> flightDtos = getFlightDtos(partialResult);
		return flightDtos.stream().filter(e -> {
			long totalSeatsAvailable = 0;

			totalSeatsAvailable = e.getSeats().stream().filter(eSeat -> {
				return eSeat.getStatus() == Status.Available;
			}).count();

			return totalSeatsAvailable >= paxCount;
		}).toList();

	}

	private List<FlightDto> getFlightDtos(List<Flight> flights) {
		List<FlightDto> result = new ArrayList<>();
		
		for (Flight flight : flights) {
			
			for (Fare fair : flight.getFares()) {
				FlightDto flightDto = new FlightDto(flight.getId(), flight.getAirLine(), flight.getFrom(),
						flight.getTo(), flight.getDepartDate().getDate() + "", flight.getDepartDate().getTime() + "",
						flight.getArrivalDate().getTime() + "", fair.getFareType(), fair.getPrice(),
						new ArrayList<>(fair.getSeats()));
				result.add(flightDto);
			}
			
		}
		
		return result;
	}

//	public List<FlightDto> searchFlight(String from, String to, int departDate, int paxCount, String preferedAirlines,
//			SortBy sortBy, SortType sortType) {
//		List<FlightDto> partialResult = searchFlight(from, to, departDate, paxCount);
//		int sortTypeNumber = sortType == SortType.ASC ? 1 : -1;
//		if (sortBy == SortBy.FROM) {
//			partialResult.sort((a, b) -> {
//				return sortTypeNumber * a.getFrom().compareTo(b.getFrom());
//			});
//		} else if (sortBy == SortBy.TO) {
//			partialResult.sort((a, b) -> {
//				return sortTypeNumber * a.getTo().compareTo(b.getTo());
//			});
//		} else if (sortBy == SortBy.DEPARTDATE) {
//			partialResult.sort((a, b) -> {
//				return sortTypeNumber * a.getDepartedDate().compareTo(b.getDepartedDate());
//			});
//		} else if (sortBy == SortBy.PRICE) {
//			partialResult.sort((a, b) -> (int) (a.getPrice() - b.getPrice()));
//		}
//		if (!preferedAirlines.isEmpty() && !preferedAirlines.isBlank()) {
//			partialResult.sort((a, b) -> {
//				if (a.getAirLine().equals(preferedAirlines) && b.getAirLine().equals(preferedAirlines)) {
//					return 0;
//				} else if (a.getAirLine().equals(preferedAirlines)) {
//					return 1;
//				} else if (a.getAirLine().equals(preferedAirlines)) {
//					return -1;
//				} else
//					return 0;
//			});
//		}
//		return partialResult;
//
//	}

	public void addFlight(Flight f) {
		FlightRepo.addFlight(f);
//		return true;
	}
}
