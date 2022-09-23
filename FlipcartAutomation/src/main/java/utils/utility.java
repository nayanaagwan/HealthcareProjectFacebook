package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class utility  {
	
	public static void main(String args[]) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		for(int i=1 ;i<5; i++)
		{
			LocalDateTime LDT = LocalDateTime.now();
			String LD=LDT.toString().replace(":","");
		TakesScreenshot take = (TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Music\\Selenium\\Screenshot\\Test"+LD+".jpeg");
		FileHandler.copy(src, dest);
		System.out.println(LD);
		//String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new()));
		//Copy the screenshot on the desire location with different name using current date and time
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\HP\\Music\\Selenium\\Screenshot\\Test.jpg"));
		
		}
	}

}
