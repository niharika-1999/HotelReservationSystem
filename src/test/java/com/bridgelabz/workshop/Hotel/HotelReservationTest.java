package com.bridgelabz.workshop.Hotel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	HotelReservation reservationSystem=new HotelReservation();
	@Test
	public void checkAddHotelAndTestHotelsForFivenDate() throws ParseException
    {
        reservationSystem.addHotel("Lakewood",110,90,3,80,80);
        reservationSystem.addHotel("Ridgewood",220,150,5,100,40);
        reservationSystem.addHotel("Bridgewood",160,50,4,110,50);
        int insert=reservationSystem.totalHotels();
        Assert.assertEquals(3,insert);
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        String entryHotel=reservationSystem.cheapHotel(formatter.parse("5Oct2020"),formatter.parse("6Oct2020"));
        Assert.assertEquals("Lakewood",entryHotel);
        String bestHotel=reservationSystem.BestRatedHotel(formatter.parse("11Sep2020"),formatter.parse("12Sep2020"));
        Assert.assertEquals("Ridgewood",bestHotel);
    }
}
	