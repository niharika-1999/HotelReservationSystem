package com.bridgelabz.workshop.Hotel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	HotelReservation reservationSystem=new HotelReservation();
	@Test
	public void checkAddHotel() throws ParseException
    {
        reservationSystem.addHotel("Lakewood",110,90);
        reservationSystem.addHotel("Ridgewood",220,150);
        reservationSystem.addHotel("Bridgewood",160,50);
        int entry=reservationSystem.totalHotels();
        Assert.assertEquals(3,entry);
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        String entryHotel=reservationSystem.cheapHotel(formatter.parse("3Oct2020"),formatter.parse("15Oct2020"));
        Assert.assertEquals("Lakewood",entryHotel);
    }
}
	