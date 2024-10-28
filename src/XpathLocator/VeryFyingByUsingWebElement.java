package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryFyingByUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter in to DWs page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(poll.isDisplayed())
		{
			System.out.println("i am DWS Page");
			driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='2']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='pollanswers-3']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='4']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Vote']")).click();
		}
		else
		{
			System.out.println(" i am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
	}

}
