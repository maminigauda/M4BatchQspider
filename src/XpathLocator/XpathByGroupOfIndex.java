package XpathLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupOfIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open The Browser
		ChromeDriver driver=new ChromeDriver();
		//maximizeBrowser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(poll.isDisplayed())
		{
			System.out.println("i am in DWS page");
			List<WebElement> subscribe = driver.findElements(By.xpath("(//input[@type='text'])[2]"));
			for (WebElement webElement : subscribe) 
			{
				webElement.sendKeys("hiiiiii");
				Thread.sleep(2000);
			}
		
		}
		else
		{
			System.out.println("I am Not DWS page");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
