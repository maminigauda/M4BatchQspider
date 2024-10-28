package Assignment20August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demoapps.qspiders.com/";
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into web page
		driver.get("https://demoapps.qspiders.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am Qspider Demo Page");
			driver.findElement(By.xpath("//div[text()='Explore more']")).click();
			String expected_result1="https://demoapps.qspiders.com/ui";
			String actual_result1=driver.getCurrentUrl();
			if(expected_result1.equals(actual_result1))
			{
				System.out.println("i am ui page");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div/div/div[2]/aside/div/div[2]/div/ul/div/ul/li/a")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Yes']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='No']")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("btn7")).click();
				Thread.sleep(2000);
			}
			else
			{
				System.out.println("i am not ui page");
			}
			
		}
		else {
			System.out.println(" i am not Qspider Demo Page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
