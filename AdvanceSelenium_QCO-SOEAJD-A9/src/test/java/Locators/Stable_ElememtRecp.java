package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stable_ElememtRecp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("http://localhost:8888");
	 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	 driver.findElement(By.name("user_password")).sendKeys("admin");
	 WebElement login = driver.findElement(By.id("submitButton"));

	 driver.navigate().refresh();
	 login.click();
	}

}
