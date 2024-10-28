package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class HandleTheNotificationPopUpInRedbus extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String expected_redbus="https://www.barbequenation.com/";
		preCondtion("Chrome");
		
		Thread.sleep(3000);
		
		
		String actual_redbus=driver.getCurrentUrl();
		
		
		if(expected_redbus.equals(actual_redbus))
		{
	
			System.out.println("Verification Successful");
			
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			
		}
		else
		{
			
			System.out.println("Verification Failed");
			driver.close();
		}
		Thread.sleep(2000);
		postCondition("quit");

	}

}
