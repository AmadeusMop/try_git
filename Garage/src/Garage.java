import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	private List<Vehicle> garage;
	
	public Garage() {
		garage = new ArrayList<Vehicle>();
	}
	
	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public boolean containsVehicle(Vehicle vehicle) { //Only used for testing
		return garage.contains(vehicle);
	}
	
	public boolean removeVehicle(Vehicle vehicle) { //Only used for testing
		return garage.remove(vehicle);
	}
	
	public int size() {
		return garage.size();
	}
	
	public String vehiclesSummary() {
		String summary = "";
		Iterator<Vehicle> iter = garage.iterator();
		while(iter.hasNext()) {
			summary += iter.next().getDetails();
		}
		return summary;
	}
}
