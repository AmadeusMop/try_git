
public class Boat extends Vehicle {
	
	public Boat() {
		this(0, "None", "None", 0, 0);
	}
	
	public Boat(int steeringWheelRadius, String make, String model, int year, int range) {
		super(steeringWheelRadius, make, model, year);
		this.range = range;
	}
	
	public String getDetails() {
		String output = "Boat\n";
		output += super.getDetails();
		output += "\n";
		return output;
	}

}
