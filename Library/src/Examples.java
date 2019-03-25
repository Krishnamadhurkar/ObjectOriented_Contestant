import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	Book hamlet = new Book("Hamlet","SH123");
	Book macbet = new Book("Macbet","SH123", 0, true);
	
	
	Request reqHamlet = new Request(hamlet,1234); 
	Request reqHamletAgain = hamlet.makeRequest(1234);
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
