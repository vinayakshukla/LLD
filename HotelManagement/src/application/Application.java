package application;
import java.util.*;

import service.*;

public class Application {
	public static BookingService bookingService = new BookingService();
	public static HoteService hoteService = new HoteService(); 
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Management Application");
	
		while(true) {
		System.out.println("Press the following key for the respective operation");
		System.out.println("1 to add hotel");
		System.out.println("2 to add room");
		System.out.println("3 to book a room");
		System.out.println("4  to search hotel");
		
		int number= sc.nextInt();
		sc.nextLine();
	    performOperation(number);
		}
	}
	public static void performOperation(int number) {
		switch(number) {
		case 1:
			System.out.println("You have selected Add Hotel operation");
			String detail= sc.nextLine();
			String []details= detail.trim().split(" ");
			if(details.length<2) {
				System.out.println("Invalid Input");
				continue;
			}
			hoteService.addHotel(details[0], details[1], new ArrayList<>());
			System.out.println("Hotel added with "+ details[0]+" address "+details[1]+"! Redirecting to main menu");
			
			break;
		case 2:
			String roomDetail= sc.nextLine();
			String []roomdetails= roomDetail.trim().split(" ");
			
			break;
		case 3:
		    break;
		case 4:
			break;
		default:
			System.out.println("Invalid input! Type exit to close the application");
			String str= sc.nextLine();
			if(str.equals("exit")) System.exit(0);
			
		
		}
		}
		
		

	}

}
