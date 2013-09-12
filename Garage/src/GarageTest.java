import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GarageTest {

	@Test
	
	public void VehicleAdding() {
		Garage g = new Garage();
		Car c1 = new Car();
		Boat b = new Boat();
		Car c2 = new Car(50, 20, "Blueberry", "Spam", 2006, 2, false, 5);
		
		g.addVehicle(c1);
		assertEquals("Garage size", 1, g.size());
		g.addVehicle(c1);
		g.addVehicle(b);
		assertEquals("Garage size", 3, g.size());
		g.removeVehicle(c1);
		assertEquals("Garage size", 2, g.size());
		g.removeVehicle(b);
		assertEquals("Garage summmary", c1.getDetails()+"\n", g.vehiclesSummary());
	}

}
