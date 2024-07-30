package taskpackage;
import java.util.ArrayList;

public class Inventory {

	ArrayList<String[]> product = new ArrayList<String[]>();
	
	
	public void addProduct(String x, String y) {
		
		String[] tarray = {x, y};
		product.add(tarray);
	}
	public void removeProduct(String x) {
		int index = 0;
		for (String[] i : product) {
			if (i[0].equals(x)) {
				index = product.indexOf(i);
				break;
			}
		}
		product.remove(index);
	}
	
	public void showProducts() {
		
		System.out.println("\nProduct List: \n");
		
		for (String[] i : product) {
			System.out.print(i[0] + ": " + i[1]);
			
			if (Integer.parseInt(i[1]) < 10){
				System.out.println(" (LOW)");
			}else {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Inventory i1 = new Inventory();
		
		
		i1.addProduct("Coconut", "7");
		i1.addProduct("Banana", "22");
		i1.addProduct("Potato Peeler", "1");
		i1.showProducts();
		i1.removeProduct("Coconut");
		
		i1.showProducts();
	}
}
