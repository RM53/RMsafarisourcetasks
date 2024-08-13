package taskpackage;

public class Course {

	String name, instructor, credits;
	
}

class OnlineCourse extends Course{
	String platform;
	int duration;
	
	
	public OnlineCourse(String x, String y, String z, String a, int b) {
		name = x; instructor = y; credits = z; platform = a; duration = b; 
		
		
	}
	public void displayDetails() {
		System.out.println("Course Name: " + name);
		System.out.println("Instructor Name: " + instructor);
		System.out.println("Credits: " + credits);
		System.out.println("Platform: " + platform);
		System.out.println("Duration: " + duration);
		
	}
	public void checkCert() {
		
		if (duration >= 200) {
			System.out.println("Course is valid for certification");
			
		} else {
			System.out.println("Course is not valid for certification");
		}
	}
	
	public static void main(String[] args) {
		OnlineCourse newcourse = new OnlineCourse("Programming Basics", "John Cleeves", "100", "Zoom", 250);
		newcourse.displayDetails();
		newcourse.checkCert();
	}
}