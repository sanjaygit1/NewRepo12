package Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repo.POMFK;

public class FlipKartEx {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();

POMFK page = new POMFK(driver);
page.enterValue("Puma");
	
	}

}
