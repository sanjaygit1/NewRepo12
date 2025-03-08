package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneColors {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

//		driver.findElement(By.name("field-keywords")).sendKeys("iphone", Keys.ENTER);
//
//		List<WebElement> allColors = driver.findElements(By.xpath(
//				"//span[text()=\"Apple iPhone 14 (128 GB) - Blue\"]/../../../..//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
//
//		for (WebElement color : allColors) {
//			System.out.println(color.getAttribute("aria-label"));
//		}

		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 14 (128 GB) - Blue\"]")).click();
	}

}
