package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting 
{
	public static WebDriver driver;
	public static void preCondtion(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("internetExplorer"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		//open the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS Page
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void postCondition(String status)
	{
		if(status.equalsIgnoreCase("close"))
		{
			driver.close();
		}
		else if(status.equalsIgnoreCase("quit"))
		{
			driver.quit();
		}
		else
		{
			driver.quit();
		}
		System.out.println("Thank You Come Again");
	}
		

}
