 package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://www.myntra.com/";
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into MYNTRA WEB PAGE
		driver.get("https://www.myntra.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am Mynta Web Page....");
			Actions act=new Actions(driver);
			WebElement men = driver.findElement(By.xpath("//a[@data-reactid='21']"));
			Thread.sleep(2000);
			act.moveToElement(men).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[@data-reactid='40']/a")).click();
			
		}
		else
		{
			System.out.println("I am not Mynta Web Page....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
