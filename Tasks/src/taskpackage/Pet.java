package taskpackage;

public class Pet {
String name, species;
int age;


}

class Dog extends Pet {
	
	String toy;
	
	public Dog (String x, String y, int z, String a) {
		
		name =x; species = y; age = z; toy = a;
	}
	
	public void showDetails() {
		System.out.println("This Dog's name is " + name + ", they are a " + species + " and are " + age + " years old. Their favourite toy is " + toy);
		
	}
	public void dogYears() {
		int dage = 7*age;
		System.out.println("They are " + dage + " in dog years");
	}
}

class Bird extends Pet {
	
	int wingspan;
	
	public Bird (String x, String y, int z, int a) {
		
		name =x; species = y; age = z; wingspan = a;
	}
	
	public void showDetails() {
		System.out.println("This Bird's name is " + name + ", they are a " + species + " and are " + age + " years old. Their wingspan is  " + wingspan + "m");
		
	}
	public void birdYears() {
		int bage = 4*age;
		System.out.println("They are " + bage + " in bird years");
	}
	
	public static void main(String[] args) {
		Bird b1 = new Bird("Jeffrey", "Cockatoo", 10, 1);
		
		b1.showDetails();
		b1.birdYears();
	}
	
	
}
