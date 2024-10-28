package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting 
{
	 public static WebDriver driver;
	 public static void preCondition(String browser)
	 {
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		 else if(browser.equalsIgnoreCase("Edge"))
		 {
			 driver=new EdgeDriver();
		 }
		 else if(browser.equalsIgnoreCase("safari"))
		 {
			 driver=new SafariDriver();
		 }
		 else if(browser.equalsIgnoreCase("internetExplour"))
		 {
			 driver=new InternetExplorerDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
	 }
	 public static void postcondition(String status)
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
		 System.out.println("Thank you Comes Again");
	
	 }
	 

}
