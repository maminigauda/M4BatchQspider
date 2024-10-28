package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleClickInCalenderPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://www.easemytrip.com/";
		//for avoiding The NotiFication PopUp BY Using ChromeOptions Class
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into web page
		driver.get("https://www.easemytrip.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("Verification is completed");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("23/09/2024")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("divRtnCal")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("30/09/2024")).click();
			Thread.sleep(2000);
			
		}
		else
		{
			System.out.println("Verification is Not completed");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
