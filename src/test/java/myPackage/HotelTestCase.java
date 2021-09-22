package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelTestCase {

	@Test
	public void test() {
		HotelReservation obj = new HotelReservation();// creating object of HotelReservation
		assertEquals(obj.addHotelLists(), true);// testing unit test
	}

}
