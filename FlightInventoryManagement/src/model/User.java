package model;

public class User {
	String id;
	String name;
	double fund;

	public User(String id, String name, double fund) {
		super();
		this.id = id;
		this.name = name;
		this.fund = fund;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFund() {
		return fund;
	}

	public void setFund(double fund) {
		this.fund = fund;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", fund=" + fund + "]";
	}

}
