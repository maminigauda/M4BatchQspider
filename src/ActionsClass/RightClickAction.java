package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demowebshop.tricentis.com/";
		// open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//Enter into DWS Web Page
		driver.get("https://demowebshop.tricentis.com/"); 
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWS Page");
			Actions act=new Actions(driver);
			WebElement register = driver.findElement(By.className("ico-register"));
			act.moveToElement(register).build().perform();
			Thread.sleep(2000);
			//contextClick() with no argument used
			//act.contextClick().build().perform();
			//contextClick() with  argument used
			act.contextClick(register).build().perform();
		}
		else
		{
			System.out.println("I am Not Dws Page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
