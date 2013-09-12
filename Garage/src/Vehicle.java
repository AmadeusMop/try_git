public abstract class Vehicle {
	private int range;
	private int steeringWheelRadius;
	private String make;
	private String model;
	private int year;
	
	public Vehicle(int range, int steeringWheelRadius, String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public int getRange() {
		return range;
	}
	
	public int getSteeringWheelRadius() {
		return steeringWheelRadius;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getDetails() {
		String output = "";
		output += "Make:\t" + getMake() + "\n";
		output += "Model:\t" + getModel() + "\n";
		output += "Year:\t" + getYear() + "\n";
		output += "Range:\t" + getRange() + "\n";
		return output;
	}

}
