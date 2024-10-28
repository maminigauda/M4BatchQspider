package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OpenInDifferentTab extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		precondition("chrome");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
//		WebElement register = driver.findElement(By.className("ico-register"));
//		Thread.sleep(2000);
//		act.keyDown(Keys.CONTROL).click(register).build().perform();
//		Thread.sleep(2000);
		//WithOut Using WebElement Method
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.ENTER).build().perform(); 
		Thread.sleep(2000);
		postCondition("quit");
	}
	

}
