package pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws Throwable {

		//step1:- path connection of the physical file(Properties file)
//FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\PropertiesData3pm.properties");

		FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData3pm.properties");
	
	//step2:- load all the keys from properties file
	Properties pro = new Properties();
	pro.load(fis);
	
	//step3:- get keys from properties file
	String BROWSER = pro.getProperty("browser");
	String URL = pro.getProperty("url");
	String USERNAME = pro.getProperty("userName");
	String PASSWORD = pro.getProperty("password");
	
	WebDriver driver;
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else if (BROWSER.equalsIgnoreCase("firefox"))
	{
	driver=new FirefoxDriver();	
	}
	else
	{
		driver=new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	driver.findElement(By.name("password")).sendKeys(PASSWORD);
	driver.findElement(By.id("login-button")).click();
	
	}
}
