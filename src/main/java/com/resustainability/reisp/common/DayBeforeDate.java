package com.resustainability.reisp.common;

import java.time.LocalDate;

public class DayBeforeDate {
	public static String converDate(String dateVal) {
		  // Assume obj.getDate() returns a string in the format "yyyy-MM-dd"
	    String dateString = dateVal;

	    // Parse the date string into a LocalDate
	    LocalDate date = LocalDate.parse(dateString);

	    // Subtract one day
	    LocalDate dayBefore = date.minusDays(1);
	    LocalDate nextDay = date.plusDays(1);
	    // Convert back to string if needed
	    String dayBeforeString = nextDay.toString();
	    
		return dayBeforeString;
	}
	
	public static String converDateY(String dateVal) {
		  // Assume obj.getDate() returns a string in the format "yyyy-MM-dd"
	    String dateString = dateVal;

	    // Parse the date string into a LocalDate
	    LocalDate date = LocalDate.parse(dateString);

	    // Subtract one day
	    LocalDate dayBefore = date.minusDays(1);
	    LocalDate nextDay = date.plusDays(1);
	    // Convert back to string if needed
	    String dayBeforeString = dayBefore.toString();
	    
		return dayBeforeString;
	}


    
}
