package flipCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class FlipcartT {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Music\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		 LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.openMessenger();
		
		String messengerPageURL = driver.getCurrentUrl();
		System.out.println( messengerPageURL);
		
		if( messengerPageURL.equals("https://www.messenger.com/")) {
			System.out.println("URL is verified");
			
		}
		else
		{
			System.out.println("URL is wrong");
		}
		
		///////////////////////////////////////////
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.openRooms();
			
			String messengerRoomPageURL = driver.getCurrentUrl();
			System.out.println( messengerRoomPageURL);
			
			if( messengerRoomPageURL.equals("https://www.messenger.com/rooms")) {
				System.out.println("URL is verified");
				
			}
			else
			{
				System.out.println("URL is wrong");
			}
			
			///////////////////////////////////////////////
			
			RoomsPage roomsPage = new RoomsPage(driver);
			roomsPage.goBackToMassenger();
				
				String RoomsPageURL = driver.getCurrentUrl();
				System.out.println( RoomsPageURL);
				String title =driver.getTitle();
				
				if(RoomsPageURL.equals("https://www.messenger.com/")  && title.equals("Messenger")) {
					System.out.println("Test case Pass");
					
				}
				else
				{
					System.out.println("Test case fail");
				}
	}
	
	
	

}
