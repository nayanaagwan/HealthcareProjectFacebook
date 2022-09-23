package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchPage {
	

	@FindBy (xpath = ("(//span[@class=\"b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken\"])[4]"))
	private WebElement live ;
	
	
	//@FindBy (xpath = ("//div[@class='z6erz7xo bdao358l on4d8346 s8sjc6am myo4itp8 ekq1a7f9 fsf7x5fv']"))
	//private WebElement playlive ;
	
	@FindBy (xpath = ("//a[text() ='Forgotten account?']"))
	private WebElement forgottenaccount ;
	
	@FindBy (xpath = ("//span[text()='Home'])[2]"))
	private WebElement home ;
	
	public  WatchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openLive() {
		live.click();
	}
	
	public void forgottenAccount() {
		forgottenaccount.click();
	}
	
/*	public void playLive() {
		playlive.click();
	}*/
	
	public void openHome() {
		home.click();
	}
}
