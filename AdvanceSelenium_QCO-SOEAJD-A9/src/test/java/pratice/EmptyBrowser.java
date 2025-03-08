package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
//		List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//	
//		for (WebElement name : names)
//		{
//			System.out.println(name.getText());
//		}
	
	driver.findElement(By.xpath("(//img[@src=\"https://static-assets-web.flixcart.com/www/linchpin/batman-returns/images/fk-default-image-75ff340b.png?q=90\"])[1]")).click();
	
	
	
	
	}

}
