package taskpackage;

public class ElectronicsProduct {

	int id;
	String name;
	Double price;
	
	public ElectronicsProduct(int x, String y, Double z) {
		
		id = x; name = y; price = z;
		
	}
	public void applyDiscount(Double x) {
		price *=x;
		
		System.out.println("Discounted Price: " + price);
		
	}
	
	
}

class WashingMachine extends ElectronicsProduct{
	
	int warranty;
	
	public WashingMachine(int x, String y, Double z, int a) {
		super(x, y, z);
		id = x; name = y; price = z; warranty = a;
	}
	public void extendWarranty(int x) {
		warranty +=x;
		System.out.println("Warranty extended to " + warranty + " days");
					
	}
	public static void main(String[] args) {
		
		WashingMachine w1 = new WashingMachine(14, "SuperWasher", 14.50, 100);
		w1.extendWarranty(50);
	}
}
