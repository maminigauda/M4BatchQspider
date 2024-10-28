package FindTheMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardFindElements {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		 if(poll.isDisplayed())
		 {
			 System.out.println("IM IN DWS PAGE");
			List<WebElement> product = driver.findElements(By.linkText("Gift Cards"));
			for (WebElement webElement : product)
			{
				webElement.click();
				Thread.sleep(2000);
			}
			
			
			 
		 }
		 else
		 {
			 System.out.println("IN NOT IN DWS PAGE");
		 }
		 Thread.sleep(3000);
		 driver.close();
		 

	}

}
