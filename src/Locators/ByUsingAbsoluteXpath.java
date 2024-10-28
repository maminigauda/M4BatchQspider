package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" i am DWS page");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li/a")).click();
			
		}
		else 
		{
			System.out.println(" i am not  DWS page");
			
		}
		

	}

}
