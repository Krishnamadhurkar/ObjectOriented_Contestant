
public class ReferenceBook extends Book {
// but we can't checkout this book 
	
	public ReferenceBook(String title, String callnum) {
		super(title, callnum);
		
	}
	
	//method override 
	public Book checkOut() {
		super.checkOut(); //to first execute method in super class and then executing more commands after
		return null;
	}
	
	//Overloading 
	public Book checkOut(String title) {
		return null;
	}
	
	//method overloading vs method overwriting 
	//two methods in different class and have exact same signature 
	//used in place of another method, cause we dont want that method, 
	//inherit something from parents but we dont want that we want this
}
