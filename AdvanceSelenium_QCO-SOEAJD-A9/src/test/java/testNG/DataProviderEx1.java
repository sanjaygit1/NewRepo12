package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {

	// executing same method multiple with different set of data
	@Test(dataProvider = "getData")
	public void bookTickets(String src, String dest,int noOfPpl) {
		System.out.println("Book tickets from " + src + " to " + dest+"--->"+noOfPpl+"");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[3][3];

		objArr[0][0] = "Goa";
		objArr[0][1] = "Banglore";
		objArr[0][2]=2;

		objArr[1][0] = "Goa";
		objArr[1][1] = "mangalore";
		objArr[1][2]=3;

		objArr[2][0] = "Goa";
		objArr[2][1] = "mysuru";
		objArr[2][2]=4;
		
		return objArr;
}
}
