import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CarTest {

	@Test
	/* For reference, Car's fields are, in constructor order:
	range, steeringWheelRadius, make, model, year, doors, isGas, fuelCapacity */
	
	public void canImplementVehicle() {
		Car c = new Car();
		assertEquals("Can get make", "None", c.getMake());
	}
	
	@Test
	
	public void defaultConstructor() { 
		Car c = new Car();
		assertEquals("Default range is correct", 0, c.getRange());
		assertEquals("Default radius is correct", 0, c.getSteeringWheelRadius());
		assertEquals("Default make is correct", "None", c.getMake());
		assertEquals("Default model is correct", "None", c.getModel());
		assertEquals("Default year is correct", 0, c.getYear());
		assertEquals("Default number of doors is correct", 4, c.getDoors());
		assertEquals("Default engine type is correct", true, c.isGas());
		assertEquals("Default fuel capacity is correct", 0, c.getFuelCapacity());
		assertEquals("Default fuel efficiency is correct", 0, c.getFuelEfficiency());
	}
	
	@Test
	
	public void paramConstructor() {
		Car c = new Car(20, "Blueberry", "Spam", 2006, 2, false, 5, 20);
		assertEquals("Specified range is correct", 70, c.getRange());
		assertEquals("Specified radius is correct", 20, c.getSteeringWheelRadius());
		assertEquals("Specified make is correct", "Blueberry", c.getMake());
		assertEquals("Specified model is correct", "Spam", c.getModel());
		assertEquals("Specified year is correct", 2006, c.getYear());
		assertEquals("Specified number of doors is correct", 2, c.getDoors());
		assertEquals("Specified engine type is correct", false, c.isGas());
		assertEquals("Specified fuel capacity is correct", 5, c.getFuelCapacity());
		assertEquals("Specified fuel efficiency is correct", 20, c.getFuelEfficiency());
	}
	
	@Test
	
	public void rangeCalculation() {
		Car gasCar = new Car(20, "oof", "rab", 2008, 4, true, 5, 20);
		Car electricCar = new Car(20, "oof", "rab", 2008, 4, false, 5, 20);
		assertEquals("Range calculation for gasoline cars works", 100, gasCar.getRange());
		assertEquals("Range calculation for electric cars works", 70, electricCar.getRange());
	}
	
	@Test
	
	public void outputDetails() {
		Car gasCar = new Car(20, "oof", "rab", 2008, 4, true, 5, 20);
		Car electricCar = new Car(20, "oof", "rab", 2008, 4, false, 5, 20);
		String gasDetails = "Car\nMake:\toof\nModel:\trab\nYear:\t2008\nRange:\t100\nDoors:\t4\nEngine:\tGasoline\n\n";
		String electricDetails = "Car\nMake:\toof\nModel:\trab\nYear:\t2008\nRange:\t70\nDoors:\t4\nEngine:\tElectric\n\n";
		assertEquals("Range calculation for gasoline cars works", gasDetails, gasCar.getDetails());
		assertEquals("Range calculation for electric cars works", electricDetails, electricCar.getDetails());
	}

}
