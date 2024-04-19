package application;

import view.*;
import java.io.*;
import java.util.*;

import dto.FlightDto;
import model.Flight;
import service.FlightService;

public class Application {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Flight Inventory Management");
		mainMenu();
	}

	public static void mainMenu() {
		System.out.println("1. Add user");	
		System.out.println("2. Search Flight");
		System.out.println("3. Book Flight");
		System.out.println("Any other string to exit");
		String selection = sc.nextLine();
		String input[] = selection.trim().split(" ");
		
		switch (input[0]) {
		case "ADDUSER":
			addUser(input);
			mainMenu();
			break;
		case "BOOK":
			bookFlight(input);
			mainMenu();
			break;
		case "SEARCHFLIGHT":
			searchFlight(input);
			mainMenu();
			break;
		 default:
			return ;
			
		}
	}


	private static void searchFlight(String input[]) {
		FlightService flightService= new FlightService();
		
		List<FlightDto> searchRes= flightService.searchFlight(input[1], input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]));
         System.out.println("Search result is"+searchRes);
	}

	private static void bookFlight(String input[]) {
		BookingView bookingView= new BookingView();
		
		if (input.length < 9) {
			System.out.println("Invalid input");
		}
		List<String> seats = new ArrayList();
		for(int i=7;i<input.length;i++) {
			seats.add(input[i]);
		}
		boolean res= bookingView.addBooking(input[1], input[2], input[3], Long.parseLong(input[4]), input[5], input[6], input[7],seats);
         if(res) {
        	 System.out.println("Booked the flight");
        	 
         }
         else {
        	 System.out.println("Booking failed");
         }
	}

	private static void addUser(String input[]) {
		UserView userView = new UserView();
			if (input.length < 4) {
			System.out.println("Invalid input");
		}
		userView.addUser(input[1], input[2], Double.parseDouble(input[3]));

	}

}
