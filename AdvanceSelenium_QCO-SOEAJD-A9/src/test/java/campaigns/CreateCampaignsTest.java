package campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.CreateContextParameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repo.CampLookUpImg;
import POM_Repo.CampValidatePage;
import POM_Repo.CreateCampPage;
import POM_Repo.CreateOrgPage;
import POM_Repo.HomePage;
import POM_Repo.LoginPageEx;
import POM_Repo.OrgLookUp;
import POM_Repo.ValidateOrg;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//@Listeners(Generic_Utility.ListenersImp.class)
//@Listeners(Generic_Utility.ExtentReport.class)
public class CreateCampaignsTest extends BaseClass {

	@Test(retryAnalyzer = Generic_Utility.RetryAnalyserImp.class)
	public void createCampaignsTest() throws Throwable {

		HomePage home = new HomePage(driver);
		home.clickCampLink();

		CampLookUpImg campImg = new CampLookUpImg(driver);
		campImg.clickCampLookUpImg();

		int ranNum = jlib.getRandomValue();

		String campNAme = elib.getExcelData("Campaigns", 0, 0) + ranNum;

		CreateCampPage campPage = new CreateCampPage(driver);
		campPage.enterCampName(campNAme);
		campPage.clickSaveButton();
 // Assert.fail("im failing the TestScript");
		
		CampValidatePage validate = new CampValidatePage(driver);
		//validate.ValidateCamp(driver, campNAme);
		String actData = validate.ValidateCamp(driver);
		Assert.assertEquals(actData, campNAme);
		System.out.println("campName is created");
	}
//-----------------------------------------------------------------------------------------------------
@Test
	public void m2()
	{
		System.out.println("Hello");
	}
}
