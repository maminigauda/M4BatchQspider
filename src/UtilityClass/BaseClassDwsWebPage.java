package UtilityClass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClassDwsWebPage 
{
	public static WebDriver driver;
		public static void preCondition() throws InterruptedException
		{
			//open the google chrome browser
			driver=new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//waiting condition
			Thread.sleep(3000);
			//enter into DWS page
			driver.get("https://demowebshop.tricentis.com/");
		}
		public static void preCondition1() throws InterruptedException
		{
			//open the Fire fox browser
			driver=new FirefoxDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//waiting condition
			Thread.sleep(3000);
			//enter into DWS page
			driver.get("https://demowebshop.tricentis.com/");
		}
		public static void preCondition2() throws InterruptedException
		{
			//open the Edge browser
			driver=new EdgeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//waiting condition
			Thread.sleep(3000);
			//enter into DWS page
			driver.get("https://demowebshop.tricentis.com/");
		}
		public static void postCondition()
		{
			System.out.println("Thank you pls come again");
			driver.close();
		}
		public static void postCondition1()
		{
			System.out.println("Thank you pls come again");
			driver.quit();
		}

	

}
