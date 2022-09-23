package flipCart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void test123()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test456()
	{
		System.out.println("Test 2");
	}
	
	@Test
	public void test678()
	{
		System.out.println("Test 3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println();
	}
	
}
