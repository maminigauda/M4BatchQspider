package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WebElementTakeScreenShot extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		precondition("Chrome");
		Thread.sleep(2000);
		String expect_url="https://demowebshop.tricentis.com/";
		String actual_url=driver.getCurrentUrl();
		if(expect_url.equals(actual_url))
		{
			System.out.println("Verification Is Done");
			WebElement dws_icon = driver.findElement(By.className("header-logo"));
			File from = dws_icon.getScreenshotAs(OutputType.FILE);
		    File to = new File("D:\\SeleniumScrhot\\dwsicon.png");
		    FileHandler.copy(from, to);
		}
		else
		{
			System.out.println("Verification Is not Done");
			driver.close();
		}
		postCondition("quit");
		
	}

}
