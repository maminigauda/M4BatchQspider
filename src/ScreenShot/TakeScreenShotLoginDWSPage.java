package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotLoginDWSPage extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		precondition("Chrome");
		String expected_Title="Demo Web Shop";
		String actual_Title=driver.getTitle();
		if(expected_Title.equals(actual_Title))
		{
			System.out.println("Verification is Done");
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.id("Email")).sendKeys("mamini01gmail.com");
			driver.findElement(By.id("Password")).sendKeys("mamini123");
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
			try
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File from = ts.getScreenshotAs(OutputType.FILE);
				File to = new File("D:\\SeleniumScrhot\\DwsLogInPage.png");
				FileHandler.copy(from, to);
				driver.findElement(By.cssSelector("a[class=\"ico-logout\"]")).click();
				System.out.println("You Enter A Wrong Credential");
			}
			catch(Exception e)
			{
				System.out.println("No defect");
				
			}
			
		}
		else
		{
			System.out.println("Verification is Not Done");
			driver.close();
		}
		postCondition("quit");
		
		
	}

}
