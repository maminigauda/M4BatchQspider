package Assignment20Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgodaWebSiteByUsingCalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		String expected_url="https://www.agoda.com/travel-guides/";
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//Enter in to Agoda Web Page
		driver.get("https://www.agoda.com/travel-guides/");
		Thread.sleep(3000);
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("Verification Is Sucessfully");
			Thread.sleep(000);
			driver.findElement(By.xpath("(//a[text()='Flights'])[2] ")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='Start date']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='Previous month']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='September 28, 2024']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@aria-label='End date']")).click();
			Thread.sleep(2000);
			for(; ;)
			{
				try {
					driver.findElement(By.xpath("//div[@aria-label='September 21, 2025']")).click();
					break;
					
				}
				catch(Exception e)
				{
					driver.findElement(By.xpath("//div[@aria-label='Next Month']")).click();
					Thread.sleep(2000);
				}
			}
		}
		else
		{
			System.out.println("Verification Is not Sucessfully");
			driver.close();
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
