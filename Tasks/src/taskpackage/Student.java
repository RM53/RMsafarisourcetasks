package taskpackage;
import java.util.ArrayList;

public class Student {

	String name, grade;
	ArrayList<String> courses = new ArrayList<String>();
	
	public Student(String x, String y) {
		
		name = x;
		grade = y;		
	}
	
	public void addCourse(String x) {
		courses.add(x);
	}
	public void removeCourse(String x) {
		courses.remove(x);
		
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Alex", "7");
		
		s1.addCourse("Maths");
		s1.addCourse("English");
		s1.addCourse("History");
		s1.removeCourse("English");
		
		String joinedList = String.join(", ", s1.courses);
		
		System.out.print(s1.name+" is in grade "+ s1.grade +" and takes: ");
		System.out.print(joinedList +"\n");
			
	}
}
