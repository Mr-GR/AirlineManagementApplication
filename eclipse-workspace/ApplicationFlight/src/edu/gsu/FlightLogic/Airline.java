package edu.gsu.FlightLogic;

import java.util.ArrayList;

import edu.gsu.gui.Flight;

public class Airline {
	
	private String AirlineName;
	
	private ArrayList<Flight> flights;
	
	

	public String getAirlineName() {
		return AirlineName;
	}

	public void setAirlineName(String airlineNam) {
		AirlineName = airlineNam;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	
	

}
