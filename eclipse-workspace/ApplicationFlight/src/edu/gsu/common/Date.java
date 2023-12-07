package edu.gsu.common;

public class Date {
	
	   public static void performAction(DateAction action) {
	        switch (action) {
	            case GET_CURRENT_DATES:
	                getCurrentDates();
	                break;
	            // Add more cases for other actions if needed
	        }
	    }

	    private static void getCurrentDates() {
	        java.util.Date utilDate = new java.util.Date();
	        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

	   
	        System.out.println(sqlDate);
	    }

	    public static void main(String[] args) {
	        performAction(DateAction.GET_CURRENT_DATES);
	    }
	}







