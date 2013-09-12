public abstract class Vehicle {
	private int range;
	private int steeringWheelRadius;
	private int doors;
	private String make;
	private String model;
	private int year;
	
	public Vehicle() {
		this(0, 0, 2, "None", "None", 0);
	}
	
	public Vehicle(int range, int steeringWheelRadius, int doors, String make, String model, int year) {
		this.doors = doors;
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
	
	public int getDoors() {
		return doors;
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
		output += "Doors:\t" + getDoors() + "\n";
		output += "Range:\t" + getRange() + "\n";
		return output;
	}

}
