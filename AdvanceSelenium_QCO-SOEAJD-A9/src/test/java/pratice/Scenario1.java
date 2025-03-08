package pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario1 {

	public static void main(String[] args) throws Throwable {
		
		//Notification Popup
		ChromeOptions settings = new ChromeOptions();
	
		//to avoid popup and to accept micro phone permission
	//	settings.addArguments("--auto-accept-camera-and-microphone-capture");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mictests.com/");

		driver.findElement(By.id("mic-launcher")).click();

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);// ----->close
		rob.keyRelease(KeyEvent.VK_TAB);

//	   rob.keyPress(KeyEvent.VK_ENTER);
//	   rob.keyRelease(KeyEvent.VK_ENTER);

		rob.keyPress(KeyEvent.VK_TAB);// ----->Allow
		rob.keyRelease(KeyEvent.VK_TAB);

		rob.keyPress(KeyEvent.VK_TAB);// ----->Allow
		rob.keyRelease(KeyEvent.VK_TAB);
	}	
	

	

}
