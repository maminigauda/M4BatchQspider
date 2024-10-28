package FindTheMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleEleByUsingForLoop {

	public static void main(String[] args) throws InterruptedException {
		// open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter in to DWS page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(community_poll.isDisplayed())
		{
			Thread.sleep(3000);
			System.out.println("i am DWS page");
			List<WebElement> poll = driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
			Thread.sleep(3000);
			for (int i = 0; i < poll.size() ; i++)
			{
				Thread.sleep(3000);
				poll.get(i).click();
			}
		}
		else {
			System.out.println("i am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
