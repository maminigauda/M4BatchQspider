package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		precondition("Chrome");
		driver.findElement(By.id("small-searchterms")).sendKeys("Camera");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\SeleniumScrhot\\DwsHomePage.png");
		FileHandler.copy(from, to);
		driver.close();
		
	}

}
