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
	 * costHotel gives the rate of the stay for each Hotel
	 * @param days
	 * @param hotel
	 * @return
	 */

	public double costHotel(List<Integer> days,Hotel hotel)
	{
		double temp=0;
		for(int j:days)
		{
			if(j>1&&j<7)
			{ 
				temp+=hotel.getWeekdayRate();
			}
			else
				temp+=hotel.getWeekendRate();  
		}
		return temp;
	}
	/**
	 * Method cheapHotel gives the cost of hotel which is cheap 
	 */
	public String cheapHotel(Date checkIn, Date checkOut)
	{
		List<Integer> days = new ArrayList<>();
		Date date = checkIn;
		while(date.compareTo(checkOut) == -1)
		{
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			days.add(cal.get(Calendar.DAY_OF_WEEK));
			cal.add( Calendar.DATE, 1 );
			date = cal.getTime();
		}
		double cost;
		double temp;
		Hotel cheapHotel=hotelReservation.get(0);
		cost = costHotel(days,cheapHotel);
		for(Hotel hotel:hotelReservation)
		{
			temp=costHotel(days,hotel);
			if(cost>temp)
			{
				cost = temp;
				cheapHotel = hotel;
			}
		} 
		System.out.println("The cheapest hotel is "+cheapHotel.getHotelName()+" and the cost of your stay is $"+cost);
		return cheapHotel.getHotelName();   
	}   


}