import java.util.Scanner;


public class Main {
	private static Garage garage = new Garage();
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Something something introductory text");
		while(constructVehicle(console)) {
			;
		}
		System.out.println("\n\n\nA summary of your garage:\n");
		System.out.println(garage.vehiclesSummary())
	}
	
	public static boolean constructVehicle(Scanner console) {
		int range, radius, doors, year, fuelCapacity;
		String make, model, engineType;
		boolean isGas;
		String vehicleType = "";
		System.out.println("What type of vehicle do you want to add?");
		System.out.print("(Car, Boat, None): ");
		vehicleType = console.next().toLowerCase();
		while(!(vehicleType.equals("car") || vehicleType.equals("boat") || vehicleType.equals("none"))) {
			if(vehicleType.equals("none")) {
				return false;
			} else if(vehicleType.equals("car") || vehicleType.equals("boat")) { 
				Vehicle newVehicle;
				//Note to self: add input sanitization ASAP
				System.out.print("What is the year of the " + vehicleType + "? ");
				year = console.nextInt();
				System.out.print("What is the make of the " + vehicleType + "? ");
				make = console.next();
				System.out.print("What is the model of the " + vehicleType + "? ");
				model = console.next();
				System.out.print("What is the range of the " + vehicleType + ", in miles? ");
				range = console.nextInt();
				System.out.print("What is the turning radius of the " + vehicleType + "'s steering wheel? ");
				radius = console.nextInt();
				if(vehicleType.equals("car")) {
					System.out.print("How many doors does the car have? ")
					doors = console.nextInt();
					do {
						System.out.print("What type of engine does the car have? (Gasoline, Electric) ");
						engineType = console.next().toLowerCase;
					} while !(engineType.equals("gasoline") || engineType.equals("electric"));
					isGas = engineType.equals("gasoline");
					System.out.print("How many " + (isGas ? "gallons of gas" : "kilowatts") + " can the " + (isGas ? "fuel tank" : "car's battery") + " hold? ");
					fuelCapacity = console.nextInt();
					newVehicle = new Car(range, radius, doors, make, model, year, isGas, fuelCapacity);
				} else {
					newVehicle = new Boat(range, radius, make, model, year);
				}
				garage.addVehicle(newVehicle);
				return true;
			} else {
				System.out.println("Sorry, \"" + vehicleType + "\" isn't a valid vehicle.")
			}
		}
	}

}
