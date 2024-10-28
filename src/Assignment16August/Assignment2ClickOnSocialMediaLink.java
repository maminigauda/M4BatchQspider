package Assignment16August;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2ClickOnSocialMediaLink {

	public static void main(String[] args) throws InterruptedException {
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		String data = poll.getText();
		System.out.println(data);
		if(poll.isDisplayed())
		{
			System.out.println("I am DWS page");
			Thread.sleep(3000);
			String rssUrl = "https://demowebshop.tricentis.com/news/rss/1";
			List<WebElement> follow = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			for (WebElement webElement : follow) 
			{
				if(driver.getCurrentUrl().equals(rssUrl))
					driver.navigate().back();
				webElement.click();
				Thread.sleep(2000);
				
				
			}
		}
		else 
		{
			System.out.println("I am NOt DWS page");
			Thread.sleep(2000);
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
	}
	

}
