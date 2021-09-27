package com.bridgelabz.workshop.Hotel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 * Hotel Reservation System Class
 * @author Niharika Rao
 *
 */


public class HotelReservation {
	private List<Hotel> hotelReservation=new ArrayList<>();
	/**
	 * Method to add hotel to the system
	 * @param hotelName
	 * @param weekdayRateForRegularCustomer
	 * @param weekendRateForRegularCustomer
	 */
	public void addHotel(String hotelName, double weekdayRateForRegularCustomer, double weekendRateForRegularCustomer)
	{
		hotelReservation.add(new Hotel(hotelName, weekdayRateForRegularCustomer, weekendRateForRegularCustomer));

	}
	/**
	 * Method totalHotel finds number of hotels in the 
	 * reservation system 
	 */
	public int totalHotels()
	{
		return hotelReservation.size();
	}

	/**
	 * Method cheapHotel gives the cost of hotel which is cheap 
	 */
	public String cheapHotel(Date checkIn, Date checkOut)
	{
		int days = (int)( (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24));
		if(days==0)
			days=1;
		double cost = hotelReservation.get(0).getWeekdayRate() * days;
		String hotelName = hotelReservation.get(0).getHotelName();
		for(int i=1;i<hotelReservation.size();i++)
		{
			if(cost>hotelReservation.get(i).getWeekdayRate() * days)
			{
				cost = hotelReservation.get(i).getWeekdayRate() * days;
				hotelName = hotelReservation.get(i).getHotelName();
			}                    
		}
		System.out.println("Hotel name to stay is "+hotelName+" and the cost is Rs."+cost);
		return hotelName;
	}  
}




