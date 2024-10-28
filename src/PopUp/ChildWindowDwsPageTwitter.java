package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ChildWindowDwsPageTwitter extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://x.com/nopCommerce";
		preCondtion("chrome");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(2000);
		
		Set<String> childs = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String str : childs) 
		{
			driver.switchTo().window(str);
			Thread.sleep(2000);
			String actual_url = driver.getCurrentUrl();			
			if(expected_url.equals(actual_url))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				Thread.sleep(2000);
			}
		}
		System.out.println(childs);

	
		
	}

}
