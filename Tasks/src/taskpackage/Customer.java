package taskpackage;
import java.util.ArrayList;

public class Customer {

	String name, email;
	static ArrayList<String[]> history = new ArrayList<String[]>();
	
	public Customer(String x, String y) {
		name = x;
		email = y;
	}
	
	public void addPurchase(String x, String y) {
		String[] tarray = {x, y};
		history.add(tarray);
		
	}
	public void totalExpenditure() {
		Double total = 0.0;
		
		for (String[] i : history) {
			total += Double.parseDouble(i[1]);
		}
		System.out.println("Total expenditure: " + total);
	}
	
	public static void main(String[] args) {
		
		Customer test = new Customer("Rob", ".......");
		test.addPurchase("hammer", "5.99");
		test.addPurchase("sandwich", "2.99");
		test.totalExpenditure();
	}
}
class LoyalCustomer extends Customer{
	
	public LoyalCustomer(String x, String y) {
		
		super(x, y);
		name = x;
		email = y;
		
	}
	
	public void applyDiscount(Double x) {
		for (String[] i: history) {
			Double newprice = 0.0;
			newprice = Double.parseDouble(i[1]) * x;
			
			i[1] = newprice.toString();
		}
	}
	
	public static void main(String[] args) {
		LoyalCustomer test = new LoyalCustomer("Rob", ".......");
		test.addPurchase("hammer", "5.99");
		test.addPurchase("sandwich", "2.99");
		test.applyDiscount(0.9);
		test.totalExpenditure();
	}
}