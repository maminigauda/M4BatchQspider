package Assignment15August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSExplourByUsingAbsoluteXPath {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		String expected_result1 = "Demo Web Shop. Register";
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into web Page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DWS page....");
			//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li/a")).click();
			String actual_result1=driver.getTitle();
			if(expected_result1.equals(actual_result1))
			{
				Thread.sleep(3000);
				System.out.println("i am Register Page....");
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div[2]//label")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys("Mamini");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Gauda");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("maminig96@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("mamini1234");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("mamini1234");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
				Thread.sleep(3000);
				
			}
			else
			{
				System.out.println(" i am not Register Page...");
				driver.close();
			}
			
			
		}
		else
		{
			System.out.println("i am not DWS page");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
