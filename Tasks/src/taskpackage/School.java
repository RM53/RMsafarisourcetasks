package taskpackage;
import java.util.ArrayList;
public class School {

	
	ArrayList<String> students = new ArrayList<String>();
	ArrayList<String> teachers = new ArrayList<String>();
	ArrayList<String> classes = new ArrayList<String>();
	
	public void addStudent(String x) {
		students.add(x);
	}
	public void addTeacher(String x) {
		teachers.add(x);
	}
	public void removeStudent(String x) {
		students.remove(x);
	}
	public void removeTeacher(String x) {
		teachers.remove(x);
	}
	public void createClass(String x) {
		classes.add(x);
	}
	
public void showSchool() {
		
		System.out.println("\nSchool Info: \n");
		System.out.print("Students: ");
		for (String i : students) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		
		System.out.print("Teachers: ");
		for (String i : teachers) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		
		System.out.print("Classes: ");
		for (String i : classes) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
	}
	
	
	
	public static void main(String[] args) {
		School school1 = new School();
		
		school1.addStudent("Alex");
		school1.addStudent("Sam");
		school1.addStudent("Alice");
		school1.removeStudent("Sam");
		school1.addTeacher("Mr. Burns");
		school1.addTeacher("Mrs. Smith");
		school1.addTeacher("Dr. Hodgekin");
		school1.removeTeacher("Mrs. Smith");
		school1.createClass("History");
		
		school1.showSchool();
				
		
		
	}
}
