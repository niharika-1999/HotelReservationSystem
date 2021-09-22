package com.bridgelabz.workshop.Hotel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HotelReservationTest {

	@Test
	public void addHotel()
	{
		HotelReservation reservation=new HotelReservation();
		String hotelName = "Lakewood";
		double weekdayRegularRate=110;
		double weekendRegularRate=80;
		double weekdayRewardRate=90;
		double weekendRateReward=80;

		Boolean check=reservation.add(hotelName,weekdayRegularRate,weekendRegularRate,weekdayRewardRate,weekendRateReward);
		assertEquals(true,check);
	}

}
