package TaskOn22August;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(community_poll.isDisplayed())
		{
			System.out.println("i am DWs Page");
			driver.findElement(By.linkText("Digital downloads")).click();
			Thread.sleep(2000);
			List<WebElement> addproduct = driver.findElements(By.xpath("//div[@class='add-info']/div[2]/input"));
			for (int i = 0; i < addproduct.size(); i++) 
			{
				Thread.sleep(2000);
				addproduct.get(i).click();
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
			Thread.sleep(2000);
			
			
		}
		else
		{
			System.out.println(" i am Not DWS Page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
