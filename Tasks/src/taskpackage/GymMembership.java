package taskpackage;

public class GymMembership {
	String name, type;
	int duration;
	
	public GymMembership(String x, int y) {
		name = x; duration = y;
		type = "Regular";
	}
	
	public void calcMem() {
		
		int totalfee = 0;
		if (type.equals("Regular")){
			totalfee = 5 * duration;
		}else if (type.equals("Premium")){
			
			if (duration > 12) {
				totalfee = 7* duration;
			}else {
				totalfee = 10* duration;
			}
			
		}
		System.out.println("Total fee: " + totalfee);
	}
}

class PremiumMembership extends GymMembership{
	Boolean spa, ptrainer;
	
	public PremiumMembership(String x, int y, Boolean a, Boolean b) {
		super(x,y);
		name = x; y = duration; spa = a; ptrainer = b;
		type = "Premium";
	}
	
	public static void main(String[] args) {
		PremiumMembership p1 = new PremiumMembership("Rob", 15, true, false);
		p1.calcMem();
		
	}
}
