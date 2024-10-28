package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldWithReleaseActiond 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into wen page
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am Dhtml page..");
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			WebElement rome = driver.findElement(By.id("box6"));
			act.clickAndHold(rome).build().perform();
			WebElement italy= driver.findElement(By.id("box106"));
			Thread.sleep(2000);
			act.release(italy).build().perform();
		}
		else
		{
			System.out.println("i am not Dhtml page..");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
