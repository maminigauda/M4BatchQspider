package Assignment15August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemoWebSite {

	public static void main(String[] args) throws InterruptedException {
		
		String excepted_result="https://demoapps.qspiders.com/";
		String excepted_result1="DemoApps | Qspiders";
		//open The Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into QspiderDemoWeb Site...
		driver.get("https://demoapps.qspiders.com/");
		String actual_result=driver.getCurrentUrl();
		if(excepted_result.equals(actual_result))
		{
			System.out.println(" I am Qspider landing page...");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/section/a/div/main/p")).click();
			String actual_result1=driver.getTitle();
			if(excepted_result1.equals(actual_result1))
			{
				System.out.println("i am UI testing page");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div/div/div[2]/section/main/section/article/aside/article/aside[2]/div/div/form/div/input")).sendKeys("mamini");
				driver.findElement(By.xpath("/html/body/div/div/div[2]/section/main/section/article/aside/article/aside[2]/div/div/form/div[2]/input")).sendKeys("mamini123@gmail.com");
				driver.findElement(By.xpath("/html/body/div/div/div[2]/section/main/section/article/aside/article/aside[2]/div/div/form/div[3]/section/input")).sendKeys("mamini@123");
				driver.findElement(By.xpath("/html/body/div/div/div[2]/section/main/section/article/aside/article/aside[2]/div/div/form/div[4]/button")).click();
			}
			else
			{
				System.out.println(" i am not UI Testing page");
				driver.close();
			}
			
			
		}
		else
		{
		System.out.println(" I am Qspider landing page...");
		driver.close();
		
		}
		Thread.sleep(3000);
		driver.close();

	}

}
