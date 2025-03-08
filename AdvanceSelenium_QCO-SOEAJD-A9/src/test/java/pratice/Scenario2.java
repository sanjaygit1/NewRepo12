package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");

		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(@class,'relative f')]")).click();
	
	   driver.findElement(By.cssSelector("[aria-label=\"Next Month\"]")).click();
	   driver.findElement(By.xpath("//div[text()='April 2025']/ancestor::div[@class='react-datepicker__month-container']/descendant::div[text()='5']")).click();
	}

}
