
public class Car extends Vehicle {
	
	boolean isGas;
	int fuelCapacity;
	
	public Car(int doors, String make, String model, int year, boolean isGas, int fuelCapacity) {
		super(doors, make, model, year);
		assert(doors == 2 || doors == 4);
		this.isGas = isGas;
		this.fuelCapacity = fuelCapacity;
	}

}