package flipCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.LoginOrSignUpPage;


import Pages.WatchPage;

public class VerifyWatchTNG {
	private WebDriver  driver;
	private  WatchPage watchPage;
	private LoginOrSignUpPage loginOrSignUpPage;
	private SoftAssert soft;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Music\\Selenium\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		if(browserName.equals("FireFox"))
		{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Music\\Selenium\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	public void createPOMObjects()
		{
		  loginOrSignUpPage = new LoginOrSignUpPage(driver);
		  watchPage = new WatchPage(driver);
		   
			
		}
	
	
	@BeforeMethod
	public void openWatchPage()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		loginOrSignUpPage.openWatch();
		String WatchPageURL = driver.getCurrentUrl();
		soft = new SoftAssert();
		
		if(WatchPageURL.equals("https://www.facebook.com/watch/")) {
			System.out.println("Watch URL is verified");
		}
		else
		{
			System.out.println("Watch URL Is wrong");
		}
	}
	
	
	
	
		
		@Test (priority = 0)
		public void openLive() {
			
			watchPage.openLive();
		
		String livepageURL = driver.getCurrentUrl();
		soft.assertEquals(livepageURL, "https://www.facebook.com/watch/live/?ref=watch");
		
		
		}	
		
		
		
		@Test
		public void forgottenAccount() {
			watchPage.forgottenAccount();
		
		String forgottenAccountURL = driver.getCurrentUrl();
		soft.assertEquals(forgottenAccountURL, "https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar&from_login_screen=0","URL is verified");
		
		
		}	
}
	
	/*	watchPage = new WatchPage(driver);
			watchPage.playLive();
		
		String playLivePageURL = driver.getCurrentUrl();
		if(playLivePageURL.equals("https://www.facebook.com/STREAMSOFJOYINTERNATIONAL/videos/478881230916225")) {
			System.out.println("live page URL is verified");
		}
		else
		{
			System.out.println("live Page URL is wrong");
		}
		
			
		}

}*/
