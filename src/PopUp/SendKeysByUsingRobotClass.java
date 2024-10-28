package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeysByUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//create a Object of ChrpmeOptions
		ChromeOptions options=new ChromeOptions();
		//avoid all notification PopUp
		options.addArguments("disable-notifications");
		//To pass Argument in ChromeDriver
		ChromeDriver driver=new ChromeDriver(options);
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into web Page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		//it will give lowercase latter if want to uppercase We need To on The Capselk Button At time of run The Program
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.close();
		
		
		
		
	}

}
