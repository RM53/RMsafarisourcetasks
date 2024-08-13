package taskpackage;
import java.util.ArrayList;

public class Event {
	String name, date, location;
	
}

class Seminar extends Event{
	int nospk;
	
	public Seminar(String x, String y, String z, int a) {
		name = x; date = y; location = z; a = nospk;
	}
	public void showDetails() {
		System.out.println("Event Name: " + name);
		System.out.println("Date: " + date);
		System.out.println("Location: " + location);
		System.out.println("Number of Speakers: " + nospk);
	}
}
class MusicalPerformance extends Event{
	
	ArrayList<String>performerlist = new ArrayList<String>();
	
	public MusicalPerformance(String x, String y, String z) {
		name = x; date = y; location = z;
	}
	
	public void addPerf(String x) {
		performerlist.add(x);
	}
	
	public void showDetails() {
		System.out.println("Event Name: " + name);
		System.out.println("Date: " + date);
		System.out.println("Location: " + location);
		
		System.out.println("Performer List:");
		for (String i: performerlist) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		MusicalPerformance m1 = new MusicalPerformance("York Festival", "05/05/2025", "York Stadium");
		m1.addPerf("David John");
		m1.addPerf("Justice");
		
		m1.showDetails();
		
		MusicalPerformance m2 = new MusicalPerformance("York Super", "05/05/2025", "York Stadium");
		
		if ((m1.date).equals(m2.date) && (m1.date).equals(m2.date)){
			System.out.println(m1.name + " conflicts with " + m2.name + "!!!!");
		}
	}
}
