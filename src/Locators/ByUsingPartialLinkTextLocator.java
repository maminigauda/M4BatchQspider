package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingPartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://www.facebook.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//Waiting Condition
		Thread.sleep(3000);
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//enter into face book page
		driver.get("https://www.facebook.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am face book landing page....");
			driver.findElement(By.partialLinkText("new account")).click();
		}
		else {
			System.out.println(" i am not face book landing page...");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
