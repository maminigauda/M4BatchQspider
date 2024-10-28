package Assignment10Sepetember;

import java.util.List;

import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task1ClickOnAll7product extends CrossBrowserTesting{

	public static void main(String[] args) throws InterruptedException 
	{
		
		preCondtion("chrome");
		Thread.sleep(2000);
		//for verifying page            
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		Actions act=new Actions(driver);
		if(poll.isDisplayed())
		{
			System.out.println("i am Dws page");
			List<WebElement> parent = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
			Thread.sleep(3000);
			act.keyDown(Keys.SHIFT).keyDown(Keys.ENTER).build().perform();
		
			for (WebElement web : parent) 
			{
				Thread.sleep(3000);
				web.click();
			}
		}
		else
		{
			System.out.println("i am not Dws page");
			
		}
		Thread.sleep(2000);
		postCondition("quit");
		
		

	}

}
