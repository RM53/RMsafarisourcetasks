package taskpackage;

import java.time.LocalTime;

public class Airplane {

	int flightnumber;
	LocalTime departureTime;
	String destination, FlightStatus;
	

	public Airplane(int x, String d, String y, String z) {
		flightnumber = x;
		
		destination = y;
		FlightStatus = z;
		
		departureTime = LocalTime.parse(d);
				
	}
	
	public void showStatus() {
		System.out.println("Current Status of Plane: " + FlightStatus);
	}
	
	public void isThereDelay() {
		if (FlightStatus.equals("Grounded") && ( departureTime.isBefore(LocalTime.now()))){
			
			LocalTime diff = departureTime.minusNanos(LocalTime.now().toNanoOfDay());
			System.out.println("There is a delay.");
			
		}else {
			System.out.println("There is not a delay");
		}
	}

	public static void main(String[] args) {
		
		Airplane a1 = new Airplane(3, "14:00", "London", "Grounded");
		
		System.out.println(a1.departureTime);
		System.out.println(LocalTime.now());
		a1.showStatus();
		a1.isThereDelay();
	}

}

