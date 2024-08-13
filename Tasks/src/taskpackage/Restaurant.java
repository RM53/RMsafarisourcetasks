package taskpackage;
import java.util.ArrayList;

public class Restaurant {

	ArrayList<String[]> menu = new ArrayList<String[]>();
	ArrayList<Double> ratings = new ArrayList<Double>();
	
	
	public void addMenu(String x, String y) {
			
			String[] tarray = {x, y};
			menu.add(tarray);
		}
	
	public void addRating(Double x) {
		ratings.add(x);
	}
	
	public void averageRating() {
		
		System.out.print("Average rating: ");
		Double sum = 0.0;
		
		for (Double i: ratings) {
			sum += i;
		}
		
		sum = sum / ratings.size();
		
		System.out.print(sum + "\n");
	}
	
	public void removeMenu(String x) {
		
		int index = 0;
		for (String[] i : menu) {
			if (i[0].equals(x)) {
				index = menu.indexOf(i);
				break;
			}
		}
		menu.remove(index);
	}
	
	
	public void showMenu() {
			
		System.out.println("\nMenu: \n");
			
		for (String[] i : menu) {
				
				
			System.out.println(i[0] + ": " + i[1]);
				
			}
		}
	
	public static void main(String[] args) {
		
		Restaurant res = new Restaurant();
		
		res.addMenu("Burger", "10.85");
		res.addMenu("Soda", "4.00");
		res.removeMenu("Burger");
		res.addRating(7.5);
		res.addRating(5.0);
		res.addRating(9.0);
		res.showMenu();
		res.averageRating();
		
			
		
	}
}
