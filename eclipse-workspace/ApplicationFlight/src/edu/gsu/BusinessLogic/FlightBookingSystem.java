package edu.gsu.BusinessLogic;

import java.util.ArrayList;

import edu.gsu.common.User;
import edu.gsu.gui.Flight;

public class FlightBookingSystem {
	
	private ArrayList<User> user;
	
	private ArrayList<Flight> flight;

	public ArrayList<User> getUser() {
		return user;
	}

	public void setUser(ArrayList<User> user) {
		this.user = user;
	}

	public ArrayList<Flight> getFlight() {
		return flight;
	}

	public void setFlight(ArrayList<Flight> flight) {
		this.flight = flight;
	}
	

}
