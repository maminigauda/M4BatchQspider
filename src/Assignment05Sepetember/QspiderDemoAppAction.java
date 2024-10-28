package Assignment05Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemoAppAction {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demoapps.qspiders.com/";
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//Enter into webPage
		driver.get("https://demoapps.qspiders.com/");
		String actual_result = driver.getCurrentUrl();		
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am QspiderDemoApp...");
			driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//section[contains(text(),'FormValidation')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys("Hello");
			driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("Mamini");
			driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("Mamini");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("damini@1234");
		    driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("damini@1234");
		    driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("Maminigauda@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maminig12@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://demoapps.qspiders.com/ui/formValidation");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("456776");
			driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("687658");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='number']")).sendKeys("23456799876");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("abc123");
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("45678990876543456789");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@value='reset']")).click();
		}
		else
		{
			System.out.println("I am not QspiderDemoApp...");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
	}
}
