package testNG;

import org.testng.annotations.Test;

public class SampleTest {

	//executing same method multiple times with same set of data 
	@Test(invocationCount = 2)
	public void createProduct()
	{
		
		System.out.println("Product created");
	}
	
	@Test
	public void modifyProduct()
	{
		System.out.println("Product modified");
	}
	
	@Test
	public void deleteProduct()
	{
		System.out.println("Product Deleted");
	}
}
