
public class Boat extends Vehicle {
	
	public Boat() {
		this(0, 0, "None", "None", 0);
	}
	
	public Boat(int range, int steeringWheelRadius, String make, String model, int year) {
		super(range, steeringWheelRadius, make, model, year);
	}
	
	public String getDetails() {
		String output = "Boat\n";
		output += super.getDetails();
		return output;
	}

}
