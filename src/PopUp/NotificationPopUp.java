package PopUp;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;


public class NotificationPopUp extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String expected_result="https://www.easemytrip.com/";
		preCondtion("Chrome");
		Thread.sleep(2000);
		String actul_result=driver.getCurrentUrl();
		if(expected_result.equals(actul_result))
		{
			System.out.println("I Am EasyMyTrip Page....");
		
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			//for Release The Key
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
		
		}
		else
		{
			System.out.println("I Am Not EasyMyTrip Page....");
		}
		Thread.sleep(2000);
		postCondition("quit");
		

	}

}
