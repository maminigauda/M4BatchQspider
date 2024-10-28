package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameUsingShoppingKartModule {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="Demo Web Shop";
		//OPen The Browser
		ChromeDriver driver=new ChromeDriver();
		//Waiting condition
		Thread.sleep(3000);
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" I am DWS page");
			driver.findElement(By.className("cart-label")).click();
		}
		else {
			System.out.println(" I am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();


	}

}
