public abstract class Vehicle {
	protected int range; //protected because, although it's used in all vehicles, Cars and Boats set it differently.
	private int steeringWheelRadius;
	private String make;
	private String model;
	private int year;
	
	public Vehicle(int steeringWheelRadius, String make, String model, int year) {
		this.steeringWheelRadius = steeringWheelRadius;
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
	
	/*
	 * For this project, I've decided not to include any setters.
	 * This is mainly because you can't "set" a vehicle's make or
	 * model after it's been built. You might be able to modify
	 * it to have a better fuel efficiency, but it's not exactly
	 * going to be in the "factory blueprints".
	 */
	
	public String getDetails() {
		String output = "";
		output += "Make:\t" + getMake() + "\n";
		output += "Model:\t" + getModel() + "\n";
		output += "Year:\t" + getYear() + "\n";
		output += "Range:\t" + getRange() + "\n";
		return output;
	}

}
