package taskpackage;

public class Vehicle {

	String make, model;
	int year;
	
	public Vehicle(String x, String y, int z){
		make = x;
		model = y;
		year = z;
	}
}

class Car extends Vehicle{
	
	Double trunksize;
	
	public Car(String x, String y, int z, Double a) {
		
		super(x,y,z);
		
		make = x;
		model = y;
		year = z;
		trunksize = a;
	}
	
	public void showDetails(){
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Trunk Size: " + trunksize + "m squared");
	}
	
}
class Truck extends Vehicle{
	Double bedsize;
	
	public Truck(String x, String y, int z, Double a) {
		
		super(x,y,z);
		make = x;
		model = y;
		year = z;
		bedsize = a;
	}
	
	public void showDetails(){
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Bed Size: " + bedsize + "m squared");
	}
	
	public static void main(String[] args) {
		Truck cooltruck = new Truck("Ford", "MegaTruck", 1998, 50.2);
		
		cooltruck.showDetails();
	}
	
}
