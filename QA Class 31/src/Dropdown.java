import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		Select sel =new Select(dropdown);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("BEL");
		Thread.sleep(2000);
		sel.selectByVisibleText("Denmark");
		
		List<WebElement> option=sel.getOptions();
		System.out.println(option.size());
		int j=0;
		
		for(int i=0;i<option.size();i++) {
			
			System.out.println(option.get(i).getText()+" - "+j);
			j++;
		}
		
	}

}
