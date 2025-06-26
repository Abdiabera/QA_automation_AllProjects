package Priority;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=2)
	public void cart() {
		System.out.println("cart");
	}
	
	@Test(priority=-4)
	public void order() {
		System.out.println("order");
	}
	@Test(priority=-3)
	public void filter() {
		System.out.println("filter");
	}
	@Test(priority=5)
	public void logOut() {
		System.out.println("logOut");
	}

}
