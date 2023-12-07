package edu.gsu.FlightLogic;

public class FlightSeat extends Seat {
	
	private int Price; 
	
	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	private Status status;

}
