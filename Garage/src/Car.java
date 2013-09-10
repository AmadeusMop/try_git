
public class Car extends Vehicle {
	
	boolean isGas;
	int fuelCapacity;
	
	public Car(int range, int steeringWheelRadius, int doors, String make, String model, int year, boolean isGas, int fuelCapacity) {
		super(range, steeringWheelRadius, doors, make, model, year);
		assert(doors == 2 || doors == 4);
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
		String output = super.getDetails();
		output += "Engine Type:\t";
		if(isGas()) {
			output += "Gasoline";
		} else {
			output += "Electric";
		}
		output += "\n";
		return output;
	}

}