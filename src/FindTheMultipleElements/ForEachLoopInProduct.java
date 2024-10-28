package FindTheMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachLoopInProduct {

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
			System.out.println("IM NOT IN DWS PAGE");
		}
		driver.close();

	}

}
