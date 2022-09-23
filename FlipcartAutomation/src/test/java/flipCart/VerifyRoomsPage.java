package flipCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;
import setup.Base;
import utils.UtilityNew;

public class VerifyRoomsPage extends Base {

	private WebDriver  driver;
	private RoomsPage roomsPage;
	private LoginOrSignUpPage loginOrSignUpPage;
	private MessengerPage messengerpage;
	private UtilityNew utility;
	private SoftAssert soft;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		   driver = openChromeBrowser();
		}
		if(browserName.equals("FireFox"))
		{
		   driver =openFirefoxBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	public void createPOMObjects() {
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
		 messengerpage = new MessengerPage(driver);
		 roomsPage = new RoomsPage(driver);
		// utility= new UtilityNew(driver);
		
	}
	
	@BeforeMethod
	public void openRoomsPage()
	{
		
		driver.get("https://www.facebook.com/");
		loginOrSignUpPage.openMessenger();
		messengerpage.openRooms();
		 soft = new SoftAssert();
		
	/*	String messengerPageURL = driver.getCurrentUrl();
		
		if( messengerPageURL.equals("https://www.messenger.com/")) {
			System.out.println("Messenger URL is verified");
		}
		else
		{
			System.out.println("Messenger URL Is wrong");
		}
		
		
		messengerpage.openRooms();
		
		String messengerRoomPageURL = driver.getCurrentUrl();
		if(messengerRoomPageURL.equals("https://www.messenger.com/rooms")) {
			System.out.println("Mesenger room page URL is verified");
		}
		else
		{
			System.out.println("Messenger Room Page URL is wrong");
		}
		
		roomsPage = new RoomsPage(driver); */
		
	}
	
	@Test 
	public void verifyGoBackToMessengerButton() {
		
		System.out.println("Test 1");
		roomsPage.goBackToMassenger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
		soft.assertEquals(url,("https://www.messenger.com/"));
		soft.assertEquals(title,("Messenger"));
		soft.assertAll();
		
		
		
	}
	
	@Test 
	public void verifyContactToHelpCenterButton() {
		
		System.out.println("Test 2");
		roomsPage.contactToHelpCenter();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);//here I making changes and to or
		
		soft.assertEquals(url, "https://www.messenger.com/help");
		soft.assertEquals(title, "Messenger help`Centre", "Messenger help Centre Title found");
		
		soft.assertAll();
		
	}
	
	
	@Test (enabled = false)
	public void test()
	{
		System.out.println("Depends");
		
	}
	//if there is no postcondition same or no required postcondition then not require to write method
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("After method");
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closedBrowser() {
		System.out.println("after class");
		driver.close();
		driver = null;
		System.gc();
	}
		
		
	}

