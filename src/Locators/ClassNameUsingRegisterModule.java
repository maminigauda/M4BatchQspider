package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameUsingRegisterModule {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="Demo Web Shop";
		// Open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am in demo web shop page");
			driver.findElement(By.className("ico-register")).click();
		}
		else {
			System.out.println("i am in not demo web shop page");
			driver.close();
		}
		

	}

}
