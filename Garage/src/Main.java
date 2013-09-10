import java.util.Scanner;


public class Main {
	private static Garage garage = new Garage();
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Something something introductory text");
		while(constructVehicle(console)) {
			;
		}
	}
	
	public static boolean constructVehicle(Scanner console) {
		String vehicleType = "";
		System.out.println("What type of vehicle do you want to add?");
		System.out.print("(Car, Boat, None): ");
		vehicleType = console.next().toLowerCase();
		switch(vehicleType) {
		case "car":
			
		case "boat":
			System.out.print("")
			int range
		}
	}

}
