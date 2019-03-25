import java.util.LinkedList;

class Library {
	LinkedList<LibItem> holdings = new LinkedList<LibItem>();
	Library(LinkedList<LibItem> holdings) {
		this.holdings = holdings;
		}
	LibItem findByTitle(String title) {
		for(Book aBook : this.holdings) {
			if(aBook.title.equals(title)) {
				return aBook;
				}
			}
		//return null;
		}
	}

class Reference {
	String title;
	String location;

	Reference(String title, String location) {
		this.title = title;
		this.location = location;
		}
	}

abstract class LibItem {
	
}

class Book {
	String title;
	String location;
	int timesOut;
	boolean isAvailable;

	Book(String title, String location, int timesOut, boolean isAvailable) {

		this.title = title;
		this.location = location;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
		}
	
	Book checkIn() {
		this.isAvailable = true;
		return this;
		}
	Book checkOut() {
		this.isAvailable = false;
		this.timesOut++;
		return this;
		}
	}

class DVD {
	String title;
	String location;
	int timesOut;
	boolean isAvailable;
	
	DVD(String title, String location, int timesOut, boolean isAvailable) {
		this.title = title;
		this.location = location;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
		}

	DVD checkIn() {
		this.isAvailable = true;
		return this;
		}
	DVD checkOut() {
		this.isAvailable = false;
		this.timesOut++;
		return this;
		}
	}