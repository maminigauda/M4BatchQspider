package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://www.facebook.com/";
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		//maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Enter into face book web page
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am In FaceBook Landing Page");
			
			driver.findElement(By.linkText("Create new account")).click();
			
		}
		else {
			System.out.println("I Am Not In FaceBook Landing Page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();

	}

}
