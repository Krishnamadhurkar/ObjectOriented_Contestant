
public class DVD {
	String title;
	String location; 
	int timesOut; 
	boolean isAvailable;
	
	DVD(String title, String location, int timesOut, boolean isAvailable) { this.title = title;
	this.location = location; this.timesOut = timesOut; this.isAvailable = isAvailable;
	}

	DVD checkIn() { this.isAvailable = true;
	return this; }

	DVD checkOut() { this.isAvailable = false; this.timesOut++;
	return this;
	} 
	
}