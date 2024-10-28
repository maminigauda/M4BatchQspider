package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopApplicationLoginPage {

	public static void main(String[] args) throws InterruptedException {
		String  expected_result="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//waiting condition
		Thread.sleep(3000);
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//enter into the DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result)) 
		{
			System.out.println(" i am DWS Page");
			String expected_resultLogin="https://demowebshop.tricentis.com/login";
			driver.get(expected_resultLogin);
			String actual_resultLogin=driver.getCurrentUrl();
			if(expected_resultLogin.equals(actual_resultLogin))
			{
				System.out.println(" i am Log in Page");
				driver.findElement(By.className("ico-login")).click();
				driver.findElement(By.id("Email")).sendKeys("mamini123@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("Mama1234");
				driver.findElement(By.id("RememberMe")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				Thread.sleep(3000);
				driver.close();
			
				
			}
			else {
				System.out.println(" i am not log in Page");
				driver.close();
			}
		}
		else 
		{
			System.out.println("i am not DWS page");
			driver.close();
		}
		
	}

}
