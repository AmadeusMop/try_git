import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {

	@Test
	
	public void canImplementVehicle() {
		Boat b = new Boat();
		assertEquals("Can get make", "None", b.getMake());
	}
	
	@Test
	
	public void defaultConstructor() { 
		Boat b = new Boat();
		assertEquals("Default range is correct", 0, b.getRange());
		assertEquals("Default radius is correct", 0, b.getSteeringWheelRadius());
		assertEquals("Default make is correct", "None", b.getMake());
		assertEquals("Default model is correct", "None", b.getModel());
		assertEquals("Default year is correct", 0, b.getYear());
	}
	
	@Test
	
	public void paramConstrubtor() {
		Boat b = new Boat(20, "Blueberry", "Spam", 2006, 50);
		assertEquals("Spebified range is correct", 50, b.getRange());
		assertEquals("Spebified radius is correct", 20, b.getSteeringWheelRadius());
		assertEquals("Spebified make is correct", "Blueberry", b.getMake());
		assertEquals("Spebified model is correct", "Spam", b.getModel());
		assertEquals("Spebified year is correct", 2006, b.getYear());
	}

}
