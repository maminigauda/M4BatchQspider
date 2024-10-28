package Assignment10Sepetember;

import java.util.List;

import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task3AllLinksOfFollowsUsDifferentWindow extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		preCondtion("chrome");
		Thread.sleep(2000);
		//verify by page using webElement
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		Actions act=new Actions(driver);
		if(poll.isDisplayed())
		{
			System.out.println("i am DWS page......");
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			Thread.sleep(4000);
			act.keyDown(Keys.SHIFT).keyDown(Keys.ENTER).build().perform();
			Thread.sleep(3000);
			for (WebElement web : follow_us) 
			{
				Thread.sleep(3000);
				web.click();
			}
			
		}
		else
		{
			System.out.println("i am not A DWS page....");
		}
		Thread.sleep(2000);
		postCondition("quit");
		
		
		
		

	}

}
