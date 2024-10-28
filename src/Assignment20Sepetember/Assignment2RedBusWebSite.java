package Assignment20Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2RedBusWebSite {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_title="Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus";
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(2000);
		//enter into Red Bus web page
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Verification Is Completed");
			driver.findElement(By.id("src")).sendKeys("Pune");
			Thread.sleep(2000);
			driver.findElement(By.id("dest")).sendKeys("Mumbai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Date']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='28']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("search_button")).click();
			Thread.sleep(3000);
			
		}
		else
		{
			System.out.println("Verification Is Not Completed");
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
