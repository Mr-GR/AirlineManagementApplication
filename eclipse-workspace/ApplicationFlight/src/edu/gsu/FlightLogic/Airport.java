package edu.gsu.FlightLogic;

import java.util.ArrayList;

import edu.gsu.gui.Flight;

public class Airport {
	
	private String name; 
	
	private Location loc; 
	
	private ArrayList<Flight> flights;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	} 

}
