public abstract class Vehicle {
	private int doors;
	private String make;
	private String model;
	private int year;
	
	public Vehicle(int doors, String make, String model, int year) {
		this.doors = doors;
		this.make = make;
		this.model = model;
		this.year = year;
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

}
