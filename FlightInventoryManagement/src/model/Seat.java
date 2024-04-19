package model;

public class Seat {
	String id;
	Status status;

	public Seat(String id, Status status) {
		super();
		this.id = id;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", status=" + status + "]";
	}

}
