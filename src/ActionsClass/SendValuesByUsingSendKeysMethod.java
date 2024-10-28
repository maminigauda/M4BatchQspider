package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class SendValuesByUsingSendKeysMethod extends CrossBrowserTesting  
{
	public static void main(String[] args) throws InterruptedException {
		precondition("Chrome");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("Mamini").build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.ENTER).build().perform();
		
		postCondition("close");
		
	}
	
	
}
