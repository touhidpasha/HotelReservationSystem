package myPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HotelTestCase {

	@Test
	public void test() {
		
		List<String> days=new ArrayList<String>();
		HotelReservation obj1 = new HotelReservation();// creating object of HotelResrvation
		days.add("10sep2020");
		days.add("11sep2020");
		//assertEquals(obj.addHotelLists(), true);// testing unit test
		assertEquals((obj1.findCheapestHotelInWeekDaysForRegularDays(days)),220);
	}

}
