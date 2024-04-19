package model;

public class FlightDate {
	int date;
	double time;

	public FlightDate(int date, double time) {
		super();
		this.date = date;
		this.time = time;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}
