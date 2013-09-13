import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GarageTest {

	@Test
	
	public void VehicleAddingAndRemoving() {
		Garage g = new Garage();
		Car c1 = new Car();
		Boat b = new Boat();
		Car c2 = new Car(20, "Blueberry", "Spam", 2006, 2, false, 5, 20);
		
		g.addVehicle(c1);
		assertEquals("Garage size", 1, g.size());
		g.addVehicle(c1);
		g.addVehicle(b);
		assertEquals("Garage size", 3, g.size());
		g.removeVehicle(c1);
		assertEquals("Garage size", 2, g.size());
		assertEquals("Removing existing vehicles", true, g.removeVehicle(b));
		assertEquals("Removing nonexistent vehicles", false, g.removeVehicle(c2));
	}
	
	@Test
	
	public void Summary() {
		Garage g = new Garage();
		Car c = new Car();
		Boat b = new Boat();
		
		g.addVehicle(c);
		g.addVehicle(b);
		
		assertEquals("Garage summmary", c.getDetails()+b.getDetails(), g.vehiclesSummary());
		
		g.removeVehicle(b);
		
		assertEquals("Garage summary", c.getDetails(), g.vehiclesSummary());
	}

}
