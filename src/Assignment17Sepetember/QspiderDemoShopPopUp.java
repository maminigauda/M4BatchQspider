package Assignment17Sepetember;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemoShopPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String expected_url="https://demoapps.qspiders.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("Its Qsipder Demo Shop");
			driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//section[contains(text(),'Popups')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[contains(text(),'Authentication')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			Robot robo=new Robot();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_D);
			robo.keyPress(KeyEvent.VK_M);
			robo.keyPress(KeyEvent.VK_I);
			robo.keyPress(KeyEvent.VK_N);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			
			Thread.sleep(1000);
			
			robo.keyPress(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_D);
			robo.keyPress(KeyEvent.VK_M);
			robo.keyPress(KeyEvent.VK_I);
			robo.keyPress(KeyEvent.VK_N);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_D);
			robo.keyRelease(KeyEvent.VK_M);
			robo.keyRelease(KeyEvent.VK_I);
			robo.keyRelease(KeyEvent.VK_N);
			Thread.sleep(2000);
			
			robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
		}
		else
		{
			System.out.println("Its Not Qsipder Demo Shop");
		}
		Thread.sleep(20000);
		driver.close();
		


	}

}
