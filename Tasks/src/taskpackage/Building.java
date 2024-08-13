package taskpackage;

public class Building {
	String address;
	int floors, area;
	
}
class ResidentialBuilding extends Building{
	int apartmentn;
	
	public ResidentialBuilding(String x, int y, int z, int a) {
		address = x; floors = y; area = z;  apartmentn = a;
	}
	
	public void calcRent() {
		
		Double rent = Double.valueOf(floors * ( 10*area) * apartmentn );
		System.out.println("Total rent of building: £" + rent);
	}
	public static void main(String[] args) {
	ResidentialBuilding r1 = new ResidentialBuilding("17 Good Lane", 5, 150, 20);
	r1.calcRent();
	}
}

class CommercialBuilding extends Building{
	
	int space;
	
	public CommercialBuilding(String x, int y, int z, int a) {
		address = x; floors = y; area = z;  space = a;
	}
	
	public void calcRent() {
		Double rent = Double.valueOf((floors) * ( (10*area) + (5* space) ));
		System.out.println("Total rent of building: £" + rent);
	}
	
	
	public static void main(String[] args) {
		
		CommercialBuilding c1 = new CommercialBuilding("Sweet Grove", 10, 500, 300);
		c1.calcRent();
	}
}
