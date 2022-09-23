package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
		@FindBy (xpath= "//input[@id='email']")
		private WebElement userName ;
	
		@FindBy (xpath= "//input[@id='pass']")
		private WebElement password ;
		
		@FindBy (xpath= "//button[@name= ' login']")
		private WebElement login ;
		
		@FindBy (xpath= "//a[@title='Take a look at Messenger.']")
		private WebElement messengerLink ;
		
		@FindBy (xpath= "//a[text() = 'Watch']")
		private WebElement watchLink ;
		
		
		
		
		//public constructor (to initialize webelement
		
		public LoginOrSignUpPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//public methods (actions on webelement)
		
		public void sendUserName() {
			userName.sendKeys("nayana1@gmail.com");
		}
		
		public void sendPassword() {
			password.sendKeys("nayana");
		}
		
		public void clicklogin_Button() {
			login.click();
		}
		
		public void openMessenger() {
			messengerLink.click();
		}
	
		public void openWatch() {
			watchLink.click();
		}

}
