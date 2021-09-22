package com.bridgelabz.workshop.Hotel;

public class Hotel {
	public String hotelName;
	public double weekdayRegularRate;
	public double weekendRegularRate;
	public double weekdayRewardRate;
	public double weekendRateReward;
	public Hotel(String hotelName,double weekdayRegularRate,double weekendRegularRate,double weekdayRewardRate,double weekendRateReward)
	{
		this.hotelName=hotelName;
		this.weekdayRegularRate=weekdayRegularRate;
		this.weekendRegularRate=weekendRegularRate;
		this.weekdayRewardRate=weekdayRewardRate;
		this.weekendRateReward=weekendRateReward;
	}

}
