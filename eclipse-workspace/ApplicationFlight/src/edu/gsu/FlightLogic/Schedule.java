package edu.gsu.FlightLogic;

import java.util.ArrayList;

import edu.gsu.gui.Flight;

public class Schedule {
	
	private Flight flight; 
	
	private Airport Start;
	
	private Airport destination; 
	
	private Flight start; 
	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Airport getAirportStart() {
		return Start;
	}

	public void setStart(Airport start) {
		Start = start;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	public Flight getStart() {
		return start;
	}

	public void setStart(Flight start) {
		this.start = start;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ArrayList<FlightSeat> getFare() {
		return fare;
	}

	public void setFare(ArrayList<FlightSeat> fare) {
		this.fare = fare;
	}

	private Status status; 
	
	private ArrayList<FlightSeat> fare; 

}
