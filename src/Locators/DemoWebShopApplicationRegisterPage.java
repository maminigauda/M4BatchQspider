package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopApplicationRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="Demo Web Shop";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//waiting Condition
		Thread.sleep(3000);
		//maximize the browser
		driver.manage().window().maximize();
		//enter into the DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" I am  DWS Page");
			driver.findElement(By.className("ico-register")).click();
			String expected_result_Resister="https://demowebshop.tricentis.com/register";
			driver.get(expected_result_Resister);
			String actual_result_Resister=driver.getCurrentUrl();
			if(expected_result_Resister.equals(actual_result_Resister))
			{
				System.out.println(" i am Register Page");
				driver.findElement(By.id("gender-female")).click();
				driver.findElement(By.name("FirstName")).sendKeys("Mamini");
				driver.findElement(By.id("LastName")).sendKeys("Gauda");
				driver.findElement(By.name("Email")).sendKeys("mamini123@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("Mama1234");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("Mama1234");
				driver.findElement(By.id("register-button")).click();
			}
			else {
				System.out.println(" i am not Register Page");
				driver.close();
			}

		}
		else {
			System.out.println(" I am not DWS Page");
		}

	}

}
