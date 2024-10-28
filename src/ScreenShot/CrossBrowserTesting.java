package ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting 
{
	public static WebDriver driver;
	public static void precondition(String Browser) throws InterruptedException
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else if(Browser.equalsIgnoreCase("internetExplorer"))
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
		//Thread.sleep(3000);
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
