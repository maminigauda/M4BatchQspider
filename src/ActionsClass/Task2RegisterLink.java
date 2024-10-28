package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task2RegisterLink extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		precondition("chrome");
		Thread.sleep(2000);
		String expected_result="https://demowebshop.tricentis.com/";
		String actual_result=driver.getCurrentUrl();
		Actions act=new Actions(driver);

		if(expected_result.equals(actual_result))
		{
			System.out.println("i am Dws Page");
			act.keyDown(Keys.TAB).build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.TAB).build().perform();
			Thread.sleep(2000);
			//act.keyDown(Keys.SHIFT).build().perform();
			//Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
			act.keyDown(Keys.TAB).click(female).build().perform();
			act.keyDown(Keys.TAB).build().perform();
			Thread.sleep(2000);
			act.sendKeys("Mamini").build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			act.sendKeys("Gauda").build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			act.sendKeys("mamini123@gmail.com").build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			act.sendKeys("mamini@123").build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			act.sendKeys("mamini@123").build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("I am not Dws Page");
			driver.close();
		}
		postCondition("quit");
		

	}

}
