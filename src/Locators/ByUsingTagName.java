package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingTagName {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_result="https://demowebshop.tricentis.com/";
		 //open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		driver.get(expected_result);
		String actual_result=driver.getCurrentUrl();
		Thread.sleep(3000);
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am in dws page");
			WebElement search_field = driver.findElement(By.tagName("input"));
			search_field.sendKeys("Mamini");
			
		}
		else 
		{
			System.out.println("i am not dws page");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
