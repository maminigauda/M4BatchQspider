package FindTheMultipleElements;

import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMEByUsingCommonAttribute {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into web page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		
		if(poll.isDisplayed())
		{
			Thread.sleep(3000);
			System.out.println(" i am in DWS page");
			List<WebElement> community_poll = driver.findElements(By.xpath("//input[@type='radio']"));
			community_poll.get(0).click();
			Thread.sleep(3000);
			community_poll.get(1).click();
			Thread.sleep(3000);
			community_poll.get(2).click();
			Thread.sleep(3000);
			community_poll.get(3).click();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println(" i am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
	}

}
