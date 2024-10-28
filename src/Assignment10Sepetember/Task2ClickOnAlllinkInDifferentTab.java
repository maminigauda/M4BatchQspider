package Assignment10Sepetember;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task2ClickOnAlllinkInDifferentTab extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		preCondtion("crome");
		Thread.sleep(2000);
		//verify Page By Using WebElement
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		Actions act=new Actions(driver);
		if(poll.isDisplayed())
		{
			System.out.println("I am DWS Page....");
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			act.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			for (WebElement web : links) 
			{
				Thread.sleep(2000);
				web.click();
			}
		}
		else
		{
			System.out.println("I am Not DWS page....");
		}
		Thread.sleep(2000);
		postCondition("quit");
		

	}

}
