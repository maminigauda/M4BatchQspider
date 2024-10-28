package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingCssSelectorRegisterModule {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		String expected_result1="Demo Web Shop. Register";
		
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into dws page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am dws home page");
			driver.findElement(By.linkText("Register")).click();
			String actual_result1=driver.getTitle();
			if(expected_result1.equals(actual_result1))
			{
				System.out.println(" i am in Register Page");
				driver.findElement(By.cssSelector("input[id='gender-female']")).click();
				driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Damini");
				driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Gauda");
				driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("Damini123@gmail.com");
				driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Damini12");
				driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Damini12");
				driver.findElement(By.cssSelector("input[id='register-button']")).click();

				Thread.sleep(3000);
				driver.close();
				
			}
			else {
				System.out.println(" i am not in Register Page");
				driver.close();
			}
			
		}
		else
		{
			System.out.println("i am not in dws page");
			driver.close();
		}

	}

}
