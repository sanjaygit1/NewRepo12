package organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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
import POM_Repo.CreateOrgPage;
import POM_Repo.HomePage;
import POM_Repo.LoginPageEx;
import POM_Repo.OrgLookUp;
import POM_Repo.ValidateOrg;

public class CreateOrganizationTest extends BaseClass {

	@Test(retryAnalyzer =Generic_Utility.RetryAnalyserImp.class)
	public void CreateOrganizationTest() throws Throwable {

//		WebDriver_Utility wlib = new WebDriver_Utility();

		HomePage home = new HomePage(driver);
		home.clickOrgLink();

		OrgLookUp lookUp = new OrgLookUp(driver);
		lookUp.clickOrgLookUp();
//Assert.fail("Fail the script");
//		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomValue();

		Excel_Utility elib = new Excel_Utility();
		String OrgName = elib.getExcelData("Organization", 0, 0) + ranNum;

		driver.findElement(By.name("accountname")).sendKeys(OrgName);
////-----------------------------------------------------------------------------------------------
//
		String phnNum = elib.readDataUsingDataFormatter("Organization", 1, 0);

		String mailId = elib.getExcelData("Organization", 2, 0);

		CreateOrgPage orgPage = new CreateOrgPage(driver);
		orgPage.enterOrgDetails(OrgName, phnNum, mailId);
		orgPage.clicksaveButton();
//------------------------------------------------------------------------------------------

		ValidateOrg validate = new ValidateOrg(driver);
		validate.ValidateOrg(driver, OrgName);
	}

}
