import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
	List<WebElement> fRow=rows.get(0).findElements(By.tagName("th"));
	System.out.println(fRow.size());
		
	String c1=fRow.get(0).getText();
	
	String c2=fRow.get(1).getText();

	
	String c3=fRow.get(2).getText();
	System.out.println(c1+" | "+ c2+" | "+c3);
	
	
	
	
	for(int i=1;i<rows.size();i++) {
		
	
	List<WebElement> SRow=rows.get(i).findElements(By.tagName("td"));

		
	String c11=SRow.get(0).getText();
	
	String c12=SRow.get(1).getText();

	
	String c13=SRow.get(2).getText();
	System.out.println(c11+" | "+ c12+" | "+c13);
		
	}	
		
		driver.quit();
		
	
	 
	
	}

}
