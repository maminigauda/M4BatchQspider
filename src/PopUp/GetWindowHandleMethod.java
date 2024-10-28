package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandleMethod extends CrossBrowserTesting 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://demowebshop.tricentis.com/news/rss/1";
		preCondtion("chrome");
		Thread.sleep(2000);
		//for Handle parent window of DWS Page
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for (WebElement web : link) 
		{
			web.click();
			String actual_url = driver.getCurrentUrl();
			Thread.sleep(2000);
			if(expected_url.equals(actual_url))
			{
				driver.navigate().back();
			}
			Thread.sleep(2000);
		}
		//for Handling The Multiple Window/Child Window
		Set<String> childs = driver.getWindowHandles();	
		System.out.println(childs);
		postCondition("quit");
		
	}

}
