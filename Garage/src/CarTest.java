import static org.junit.Assert.*;

import org.junit.Test;


public class CarTest {

	@Test
	public void canImplementVehicle() {
		Car c = new Car();
		assertEquals("Can get make", "None", c.getMake());
	}

}
