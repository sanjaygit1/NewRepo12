package campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.Validate;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repo.CampLookUpImg;
import POM_Repo.CampValidatePage;
import POM_Repo.CreateCampPage;
import POM_Repo.CreateProductPage;
import POM_Repo.HomePage;
import POM_Repo.LoginPageEx;
import POM_Repo.ProductLookUpImg;
import POM_Repo.WindowSwitchingPage;

public class CreateCampaignWithProductTest extends BaseClass {

	//@Test(groups = "smokeTest")
	public void createCampaignWithProductTest() throws Throwable {

		WebDriver_Utility wlib = new WebDriver_Utility();

		HomePage home = new HomePage(driver);
		home.clickPrdLink();

		ProductLookUpImg lookUp = new ProductLookUpImg(driver);
		lookUp.prdLookUpImg();

		int ranNum = jlib.getRandomValue();
		String PrdName = elib.getExcelData("Product", 0, 0) + ranNum;

		CreateProductPage prdPage = new CreateProductPage(driver);
		prdPage.enterPrdName(PrdName);
		prdPage.clickSaveButton();
		// ---------------------------------------------------------------------------------------------------

		home.clickCamp();

		CampLookUpImg lookUp1 = new CampLookUpImg(driver);
		lookUp1.clickCampLookUpImg();

		String campNAme = elib.getExcelData("Campaigns", 0, 0) + ranNum;
		// driver.findElement(By.name("campaignname")).sendKeys(campNAme);

		WindowSwitchingPage window = new WindowSwitchingPage(driver);
		window.clickPrdPlusSign();

		CreateCampPage campPage = new CreateCampPage(driver);
		campPage.enterCampName(campNAme);

		wlib.windowSwitching(driver, "Products&action");
		window.enterPrdName(PrdName);
		window.clickprdSearchBar();
		window.selectPrdName(driver, PrdName);

		wlib.windowSwitching(driver, "Campaigns&action");
		campPage.clickSaveButton();

		CampValidatePage Validatecamp = new CampValidatePage(driver);
		CampValidatePage validate = new CampValidatePage(driver);
		//validate.ValidateCamp(driver, campNAme);
		String actData = validate.ValidateCamp(driver);
		Assert.assertEquals(actData, campNAme);
		System.out.println("campName is created");
		
		Validatecamp.ValidatePrd(driver, PrdName);

	}

}
