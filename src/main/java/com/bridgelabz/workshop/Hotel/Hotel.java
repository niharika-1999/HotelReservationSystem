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
	private double weekendRateForRewardCustomer;
	private double weekdayRateForRewardCustomer;
	private int hotelRatings;

	public Hotel(String hotelName,double weekdayRateForRegularCustomer,double weekendRateForRegularCustomer, int hotelRatings, double weekdayRateForRewardCustomer, double weekendRateForRewardCustomer)
	{
		this.setHotelName(hotelName);
		this.setWeekdayRateForRegularCustomer(weekdayRateForRegularCustomer);
		this.setWeekendRateForRegularCustomer(weekendRateForRegularCustomer);
		this.setWeekdayRateForRewardCustomer(weekdayRateForRewardCustomer);
		this.setWeekendRateForRewardCustomer(weekendRateForRewardCustomer);
		this.setHotelRatings(hotelRatings);
	}


	public String getHotelName() 
	{
		return hotelName;
	}

	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}

	public int getRatings()
	{
		return hotelRatings;
	}

	public void setHotelRatings(int hotelRatings) 
	{
		this.hotelRatings = hotelRatings;
	}

	public double getWeekdayRateForRegularCustomer() 
	{
		return weekdayRateForRegularCustomer;
	}

	public void setWeekdayRateForRegularCustomer(double weekdayRateForRegularCustomer)
	{
		this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
	}

	public double getWeekendRateForRegularCustomer()
	{
		return weekendRateForRegularCustomer;
	}

	public void setWeekendRateForRegularCustomer(double weekendRateForRegularCustomer)
	{
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
	}	

	public double getWeekendRateForRewardCustomer()
	{
		return weekendRateForRewardCustomer;
	}

	private void setWeekendRateForRewardCustomer(double weekendRateForRewardCustomer) 
	{
		this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
	}

	public double getWeekdayRateForRewardCustomer()
	{
		return weekdayRateForRewardCustomer;
	}

	private void setWeekdayRateForRewardCustomer(double weekdayRateForRewardCustomer) 
	{
		this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;		
	}
}


