package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValueInDream11 {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://www.dream11.com/";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition by using implicit waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into Dream11 page
		driver.get("https://www.dream11.com/");
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("Verification is Completed");
			//switch the controller to the i Frame by using int index
			//1....driver.switchTo().frame(0);
			//WebElement phone_Number = driver.findElement(By.id("regEmail"));
			//phone_Number.sendKeys("8847806684");
			//Thread.sleep(4000);
			
			//2.....switch the controller to the i Frame by using String
			//driver.switchTo().frame("send-sms-iframe");
			//WebElement phone_Number = driver.findElement(By.id("regEmail"));
			//phone_Number.sendKeys("8847806684");
			//Thread.sleep(4000);
			
			//3......switch the controller to the i Frame by using WebElement
			//WebElement web = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
			//driver.switchTo().frame(web);
			//WebElement phone_Number = driver.findElement(By.id("regEmail"));
			//phone_Number.sendKeys("8847806684");
			
			//4....switch the controller from parent page by using ParentFrame
			driver.switchTo().parentFrame();
			//driver.switchTo().defaultContent();
			driver.findElement(By.id("hamburger")).click();
			Thread.sleep(4000);
		}
		else
		{
			System.out.println("Verification is Not Completed");
			driver.close();
		}
		driver.quit();	
		
	}

}
