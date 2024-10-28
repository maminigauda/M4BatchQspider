package TaskOn22August;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.model.NavigatedWithinDocument;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement  community_poll= driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(community_poll.isDisplayed())
		{
			System.out.println(" i am DWs page");
			List<WebElement> poll= driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			Thread.sleep(2000);
			for (int i = 0; i < poll.size(); i++) 
			{
				Thread.sleep(2000);
				poll.get(i).click();
				driver.navigate().back();
			}
		}
		else
		{
			System.out.println(" i am not DWS page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
         
	}

}
