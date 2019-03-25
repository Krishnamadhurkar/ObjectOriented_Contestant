
public class Book  {

	String title;
	String callNum;
	int timesOut;
	boolean isAvailable;
	
	public Book(String title, String callNum, int timesOut, boolean isAvailable)
	{
		this.title = title;
		this.callNum = callNum;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}
	//method overloading
	public Book(String title, String callNum)
	{
		this.title = title;
		this.callNum = callNum;
		this.timesOut = 0;
		this.isAvailable = true;
	}
	
	public Book checkOut() {
		//mutators , 
		//this.timesOut = this.timesOut + 1; 
		this.timesOut += 1;
		this.isAvailable = false; 
		return this; 
		
	}
	
	public Request makeRequest(int cardNum) {
		return new Request(this, cardNum);
	}
	
}

