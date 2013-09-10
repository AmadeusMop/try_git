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
	
	public String vehiclesSummary() {
		String summary = "";
		Iterator<Vehicle> iter = garage.iterator();
		while(iter.hasNext()) {
			summary += iter.next().getDetails();
			summary += "\n";
		}
		return summary;
	}
}
