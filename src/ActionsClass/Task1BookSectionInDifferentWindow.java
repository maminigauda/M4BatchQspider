package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task1BookSectionInDifferentWindow extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		precondition("chrome");
		Thread.sleep(2000);
		String expected_result="https://demowebshop.tricentis.com/";
		String actual_result=driver.getCurrentUrl();
		
		if(expected_result.equals(actual_result))
		{
			System.out.println(" I am dws page");
			Actions act=new Actions(driver);
			//With  Using WebElement
			WebElement book = driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]"));
			Thread.sleep(2000);
			act.keyDown(Keys.SHIFT).click(book).build().perform();
			//without Using WebElement
			act.keyDown(Keys.TAB).build().perform();
			Thread.sleep(2000);
			for(int i=0;i<=7;i++)
			{
				act.keyDown(Keys.TAB).build().perform();
				Thread.sleep(2000);
			}
			//open for New window
			act.keyDown(Keys.SHIFT).build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
		}
		else
		{
			System.out.println(" I am not dws page");
		}
		Thread.sleep(2000);
		postCondition("quit");

	}

}
