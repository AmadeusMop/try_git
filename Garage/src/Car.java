
public class Car extends Vehicle {
	
	private boolean isGas;
	private int fuelCapacity;
	private int doors;
	
	public Car() {
		this(0, 0, "None", "None", 0, 4, true, 0);
	}
	
	public Car(int range, int steeringWheelRadius, String make, String model, int year, int doors, boolean isGas, int fuelCapacity) {
		super(range, steeringWheelRadius, make, model, year);
		this.doors = doors;
		this.isGas = isGas;
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getDoors() {
		return doors;
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
		output += "Doors:\t";
		output += getDoors();
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