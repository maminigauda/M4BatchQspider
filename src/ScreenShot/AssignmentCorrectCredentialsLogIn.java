package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class AssignmentCorrectCredentialsLogIn extends CrossBrowserTesting 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		precondition("chrome");
		String excepted_title="Demo Web Shop";
		String actual_title=driver.getTitle();
		if(excepted_title.equals(actual_title))
		{
			System.out.println("Verification is Done");
			driver.findElement(By.cssSelector("a[class='ico-login']")).click();
			driver.findElement(By.id("Email")).sendKeys("mamini123@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Mama12");
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			
			try {
				System.out.println("There is Bug Then We will Take ScreenShot");
				driver.findElement(By.cssSelector("a[class='ico-logout']"));
				TakesScreenshot ts =(TakesScreenshot) driver;
				File form = ts.getScreenshotAs(OutputType.FILE);
				File to = new File("D:\\SeleniumScrhot\\login.png");
				FileHandler.copy(form, to);
			}
			catch(Exception e)
			{
				System.out.println("There is No Bug");
			} 
		}
		else
		{
			System.out.println("Verification is  not Done");
		}
		
		
	}

}
