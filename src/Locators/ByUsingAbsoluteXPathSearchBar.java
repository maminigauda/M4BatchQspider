package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingAbsoluteXPathSearchBar {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_result="https://demowebshop.tricentis.com/";
	
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DWS page");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input")).sendKeys("Bike");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println(" i am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
	}

}
