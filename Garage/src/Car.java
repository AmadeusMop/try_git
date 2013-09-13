
public class Car extends Vehicle {
	
	private boolean isGas;
	private int fuelCapacity;
	private int doors;
	private int fuelEfficiency;
	
	public Car() {
		this(0, "None", "None", 0, 4, true, 0, 0);
	}
	
	public Car(int steeringWheelRadius, String make, String model, int year, int doors, boolean isGas, int fuelCapacity, int fuelEfficiency) {
		super(steeringWheelRadius, make, model, year);
		this.doors = doors;
		this.isGas = isGas;
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.range = (int)(fuelCapacity*fuelEfficiency*(isGas ? 1.0 : 0.7));
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
	
	public int getFuelEfficiency() {
		return fuelEfficiency;
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
		output += "\n\n";
		return output;
	}

}