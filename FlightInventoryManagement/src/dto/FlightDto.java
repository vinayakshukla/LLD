package dto;

import java.util.List;

import model.FlightDate;
import model.Seat;

public class FlightDto {
	  long id;
	     String airLine;
	     String from;
	     String to;
	     String departedDate;
	     String departedTime;
	     String arrivalTime;
	     String fareType;
	     double price;
	     List<Seat> seats;
	     
		public FlightDto(long id, String airLine, String from, String to, String departedDate, String departedTime,
				String arrivalTime, String fareType, double price, List<Seat> seats) {
			super();
			this.id = id;
			this.airLine = airLine;
			this.from = from;
			this.to = to;
			this.departedDate = departedDate;
			this.departedTime = departedTime;
			this.arrivalTime = arrivalTime;
			this.fareType = fareType;
			this.price = price;
			this.seats = seats;
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
		public String getDepartedDate() {
			return departedDate;
		}
		public void setDepartedDate(String departedDate) {
			this.departedDate = departedDate;
		}
		public String getDepartedTime() {
			return departedTime;
		}
		public void setDepartedTime(String departedTime) {
			this.departedTime = departedTime;
		}
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public String getFareType() {
			return fareType;
		}
		public void setFareType(String fareType) {
			this.fareType = fareType;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public List<Seat> getSeats() {
			return seats;
		}
		public void setSeats(List<Seat> seats) {
			this.seats = seats;
		}
		@Override
		public String toString() {
			return "FlightDto [id=" + id + ", airLine=" + airLine + ", from=" + from + ", to=" + to + ", departedDate="
					+ departedDate + ", departedTime=" + departedTime + ", arrivalTime=" + arrivalTime + ", fareType="
					+ fareType + ", price=" + price + ", seats=" + seats + "]";
		}
	     
		
}
