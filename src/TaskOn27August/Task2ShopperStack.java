package TaskOn27August;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2ShopperStack {

	public static void main(String[] args) throws InterruptedException 
	{
		String expcted_result="ShoppersStack";
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Window
		driver.manage().window().maximize();
		//Waiting Condition
		Thread.sleep(3000);
		//Enter Into ShopperStack Web Page
		driver.get("https://www.shoppersstack.com/");
		String actual_result=driver.getTitle();
		if(expcted_result.equals(actual_result))
		{
			System.out.println("I AM SHOPPER STACK WEB PAGE");
			Thread.sleep(20000);
			driver.findElement(By.id("loginBtn")).click();	
			Thread.sleep(2000);
			driver.findElement(By.id("Email")).sendKeys("maminiga96@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("Mamini96");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			Thread.sleep(2000);			
		}
		else
		{
			System.out.println("I AM NOT SHOPPER STACK WEB PAGE");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
