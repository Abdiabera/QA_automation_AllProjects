import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
	
	Set<String> wins=driver.getWindowHandles();
	 Iterator<String> it =wins.iterator(); 
	 String win1=it.next();
	 String win2=it.next();
	
	System.out.println(wins.size());
	driver.switchTo().window(win2);
	driver.findElement(By.xpath("//a[normalize-space()='Our Story']")).click();
	driver.quit();
	

	}

}
