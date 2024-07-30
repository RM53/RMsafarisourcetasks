import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book{
	String title, author, ISBN;
	int index;
	
	public book(String x, String y, String z, int a) {
		
		title = x;
		author = y;
		ISBN = z;
		index =a;
	}
	
	public static void main(String[] args) {
		boolean finish = true;
		int setindex=0, getindex = 0;
		Scanner myObj = new Scanner(System.in);
		String choice, bookName, bookAuthor, bookISBN;
		
		List<book> Collection = new ArrayList<book>();
		while (finish){
			System.out.println("Remove a book? Add a Book?");
			choice = ((myObj.nextLine()).toString()).toUpperCase();
			System.out.println(choice);
				
			if (choice.equals("Y")) {
				System.out.println("Worked.");
					
			}else if (choice.equals("E")) {
				
					finish =false;
					
			}else if (choice.equals("A")) {
				
				System.out.println("Name?");			
				bookName = myObj.nextLine().toString();
				System.out.println("Author?");
				bookAuthor = myObj.nextLine().toString();
				System.out.println("ISBN?");
				bookISBN = myObj.nextLine().toString();	
				book b1 = new book(bookName, bookAuthor, bookISBN, setindex);
				Collection.add(b1);
				setindex +=1;
						
			}else if (choice.equals("P")) {
				for (book i : Collection) {
					System.out.println("Book Title: " + i.title + "(" + i.index + ")");
					System.out.println("Author: " + i.author + "\n");
				}
			} else if (choice.equals("R")){
				System.out.println("Remove what book?");			
				getindex = Integer.parseInt(myObj.nextLine());
				
				Collection.remove(getindex);
			
			} else {
				System.out.println("test");
			}
		}
	}
}