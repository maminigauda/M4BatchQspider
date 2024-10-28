package FindTheMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingMultiWebInCategories {

	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter in to DWs page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(poll.isDisplayed())
		{
			System.out.println("i am DWs page");
			List<WebElement> product = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
			for (WebElement web : product) 
			{
				web.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
			}
		}
		else
		{
			System.out.println(" i am not DWS page");
			driver.close();
		}
		
		driver.close();
	}

}
