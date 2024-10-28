package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demowebshop.tricentis.com/";
		// open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter Into  Web page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWs Page");
			Actions act=new Actions(driver);
			driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
			act.click(search).build().perform();
		}
		else
		{
			System.out.println("I am not DWs Page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
