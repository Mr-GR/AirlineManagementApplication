package edu.gsu.BusinessLogic;

import edu.gsu.FlightLogic.Location;
import edu.gsu.common.User;
import edu.gsu.gui.Flight;

public class BookingDetails {
	
	private Flight flight;
	
	private User user;
	
	private Location Start;
	
	private Location destination; 
	
	private Location date;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getStart() {
		return Start;
	}

	public void setStart(Location start) {
		Start = start;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	public Location getDate() {
		return date;
	}

	public void setDate(Location date) {
		this.date = date;
	} 
}
