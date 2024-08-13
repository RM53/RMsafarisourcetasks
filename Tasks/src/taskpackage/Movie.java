package taskpackage;
import java.util.ArrayList;

public class Movie {

	ArrayList<String> actors = new ArrayList<String>();
	ArrayList<String> reviews = new ArrayList<String>();
	String director;

	public void addReview(String x) {
		
		reviews.add(x);
	}
	public void removeReview(String x) {
		reviews.remove(x);
	}
	
	public static void main (String[] args) {
		
		Movie movie1 = new Movie();
		
		movie1.actors.add("Steve Johnson");
		movie1.director = "Philip Steve";
		
		
		movie1.addReview("Pretty Good");
		movie1.addReview("Terrible");
		movie1.removeReview("Terrible");
		
		System.out.println(movie1.reviews);
	}
	
}
