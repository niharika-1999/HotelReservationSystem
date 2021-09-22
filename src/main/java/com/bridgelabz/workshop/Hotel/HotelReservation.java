package com.bridgelabz.workshop.Hotel;
import java.util.*;

public class HotelReservation {
	private List<Hotel> hotelReservation=new ArrayList();
	public boolean add(String hotelName,double weekdayRegularRate,double weekendRegularRate,double weekdayRewardRate,double weekendRateReward)
	{
		hotelReservation.add(new Hotel(hotelName,weekdayRegularRate,weekendRegularRate,weekdayRewardRate,weekendRateReward));
		if(hotelReservation.isEmpty())
			return false;
		else
			return true;
	}

}
