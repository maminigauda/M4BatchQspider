package TaskOn12Sepetember;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task1DWSWebPage extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String excepted_rslt = "https://demowebshop.tricentis.com/";
		String expected_facebook = "https://www.facebook.com/nopCommerce";
		String expected_twitter = "https://x.com/nopCommerce";
		String expected_youtube = "https://www.youtube.com/user/nopCommerce";
		String expected_google = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		String expected_rss = "https://demowebshop.tricentis.com/news/rss/1";
		String actual_rslt = driver.getCurrentUrl();
		if(excepted_rslt.equals(actual_rslt))
		{
			System.out.println("verification is done");
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			for(WebElement web : links)
			{
				act.keyDown(Keys.SHIFT).click(web).build().perform();
				Thread.sleep(3000);
			}
			
			Set<String> childs = driver.getWindowHandles();
			for(String str:childs)
			{
				driver.switchTo().window(str);
				String facebook = driver.getCurrentUrl();
				String twitter = driver.getCurrentUrl();
				String youtube = driver.getCurrentUrl();
				String google = driver.getCurrentUrl();
				String rss = driver.getCurrentUrl();
				if(expected_facebook.equals(facebook))
				{

					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(3000);
					
				}
				else if(expected_twitter.equals(twitter))
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Sign up with Apple']")).click();
					Thread.sleep(3000);
				}
				else if(expected_youtube.equals(youtube))
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("pranali");
					Thread.sleep(3000);
				}
				else if(expected_google.equals(google))
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@title='Search This Blog']")).sendKeys("pgsh");
					Thread.sleep(2000);
				}
				else if(expected_rss.equals(rss))
				{
					WebElement text = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
					String str1 = text.getText();
					System.out.println(str1);
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("verification is not done");
				}
			}
		}
		Thread.sleep(2000);
		postCondition("quit");
	}

}
