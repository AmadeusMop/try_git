
public class Car extends Vehicle {
	
	boolean isGas;
	int fuelCapacity;
	
	public Car() {
		this(0, 0, 4, "None", "None", 0, true, 0);
	}
	
	public Car(int range, int steeringWheelRadius, int doors, String make, String model, int year, boolean isGas, int fuelCapacity) {
		super(range, steeringWheelRadius, doors, make, model, year);
		this.isGas = isGas;
		this.fuelCapacity = fuelCapacity;
	}
	
	public boolean isGas() {
		return isGas;
	}
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	
	public String getDetails() {
		String output = "Car\n";
		output += super.getDetails();
		output += "Engine:\t";
		if(isGas()) {
			output += "Gasoline";
		} else {
			output += "Electric";
		}
		output += "\n";
		return output;
	}

}