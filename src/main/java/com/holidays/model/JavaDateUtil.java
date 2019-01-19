package com.holidays.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class JavaDateUtil {

	public static void main(String[] args) {
		
		
		LocalDate d = LocalDate.now();
		
		//System.out.println(d.getLong(field)));
		System.out.println(d.getDayOfYear());
		System.out.println(d.getMonthValue());
		System.out.println(d.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
		System.out.println(d.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
		System.out.println(d.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
		//System.out.println(d.get(ChronoField.));
		
		//DayOfWeek.MONDAY

		getFriendshipday(2019);

	}
	
	
	
	public static LocalDate getFriendshipday(int year) {
		
		// it comes in aug 1 sunday each year 
		
		LocalDate date = LocalDate.of(year, Month.OCTOBER, 1);
		
		System.out.println(" 1str date oct "+date);
		
		// get the day 
		
		System.out.println(date.getDayOfWeek());
		
		
		
		return null;
	}
}
