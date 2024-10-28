package Assignment04Sepetember;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1ForMyntraWebsite {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://www.myntra.com/";
		// open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(2000);
		//Enter into MyntaWeb Page
		driver.get("https://www.myntra.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am  Myntra Home page....");
			Thread.sleep(2000);
			List<WebElement> common = driver.findElements(By.xpath("//div[@class='desktop-navLink']"));
			Actions act=new Actions(driver);
			for (WebElement webElement : common) 
			{
				act.moveToElement(webElement).build().perform();
				Thread.sleep(2000);
				
			}
		}
		else
		{
			System.out.println("I am Not Myntra Home page..");
			driver.close();
		
		}
		Thread.sleep(20000);
		driver.close();
	}

}
