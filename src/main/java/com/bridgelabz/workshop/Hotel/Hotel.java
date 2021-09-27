package com.bridgelabz.workshop.Hotel;
/**
 * Hotel class consist of different hotel its rate and ratings
 * getters and setters used to get the name of hotel its rate and 
 * ratings
 * @author Niharika Rao
 *
 */

public class Hotel
{
	private String hotelName;
	private double weekdayRateForRegularCustomer;
	private double weekendRateForRegularCustomer;

	public Hotel(String hotelName,double weekdayRateForRegularCustomer,double weekendRateForRegularCustomer)
	{
		this.setHotelName(hotelName);
		this.setWeekdayRate(weekdayRateForRegularCustomer);
		this.setWeekendRate(weekendRateForRegularCustomer);
	}

	public String getHotelName() 
	{
		return hotelName;
	}

	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}

	public double getWeekdayRate() 
	{
		return weekdayRateForRegularCustomer;
	}

	public void setWeekdayRate(double weekdayRateForRegularCustomer)
	{
		this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
	}

	//getter method to get rate of regular weekend
	public double getWeekendRate()
	{
		return weekendRateForRegularCustomer;
	}

	//setter method to set the rate of regular weekend
	public void setWeekendRate(double weekendRateForRegularCustomer)
	{
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
	}	 
}

