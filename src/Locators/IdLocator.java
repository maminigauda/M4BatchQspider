package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="Demo Web Shop";
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWS page");
			driver.findElement(By.id("small-searchterms")).sendKeys("PS5");
		}
		else 
		{
			System.out.println("I am not DWS page");
			driver.close();
			
		}
		Thread.sleep(3000);
		driver.close();

	}

}
