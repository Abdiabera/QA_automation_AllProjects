package Assertions;





import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CompareTest {
	
	@Test
	public void compare() {
		String name="James";
		
      //  assertEquals(name, "Peter");
       assertEquals(name, "Kevin","names of each other doesnt match");
		
		
		
		
		
	}

}
