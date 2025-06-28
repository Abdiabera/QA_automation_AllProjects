package Parameters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"browser","url","uname","pwd"})
	public void logintest(String browser, String url, String uname, String pwd) {
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pwd);
		
		
		
	
		
		
	}

}
