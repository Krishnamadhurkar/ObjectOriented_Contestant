//import java.awt.print.Book;
import java.util.LinkedList;


/**
 * Add classes and modify existing code so that the library holdings can contain any of the three
 * kinds of items. create additional classes to share feilds and methods 
 * @author krishnamadhurkar
 *
 */

public class Library {
	
	//IList books;
	LinkedList<Book> holdings;
	
	public Library(LinkedList<Book> holdings) {
		this.holdings = holdings;
	}
	
//	public Library() {
//		this.holdings = new LinkedList<Book>();
//	}
	

	Book findByTitle(String title) {
		for(Book aBook : this.holdings) {
			if(aBook.title.equals(title)) {
				return aBook;
				}
			}
		return null;
		}
	
	//looping (element based for loop)
//	public boolean findABook(String myTitle) {
//		for (Book aBook : books) { // for each book in this . book store it in this variable (abook and run this process)
//			//System.out.println(aBook.title);
//			if(aBook.title.equals(myTitle)) {
//				return true;
//			}
//		}
//		return false; 
//	}
//	
//	public void addBook(Book aBook) {
//	books.add(aBook); 
//}
//	public int countAllTheBooksThatMatchTitle(my title) {
//		//return books.countBooks();
//		int numOfBooks = 0;
//		for (Book aBook : this.books){
//			if(book title matches my title)
//			numOfBooks++; 
//		}
//		return books.size(); 
//	}
	
	boolean timeToReplace(Book aBook) {	
		return aBook.checkOut().timesOut > 400;
	}
	
	
}


// read through java API built in methods to linked Lists 