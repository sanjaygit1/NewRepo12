package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

	//SoftAssert:-
	//* All methods are non static in nature
	//* If assert fails does not stops the execution,it contionues the execution
	//* AssertAll() method is mandatory--->code/method required to track the fail status
	//* If Assert fails throws AssertError Execption
	//* Used for Non mandatory fields
	
	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false);
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
	}
}
