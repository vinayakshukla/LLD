package model;

public class Bookings {
    String bookingId;
    String hotelId;
    int rNo;
    int duration;
    int startDate;
    
	public Bookings(String bookingId, String hotelId, int rNo, int duration, int startDate) {
		super();
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.rNo = rNo;
		this.duration = duration;
		this.startDate = startDate;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

}
