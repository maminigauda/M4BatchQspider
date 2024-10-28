package Assignment24Sepetember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleiFrame {

	public static void main(String[] args) 
	{
		//String expected_url="https://demoapps.qspiders.com/";
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into web page
		driver.get("https://demoapps.qspiders.com/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Single Platform']"));

		if(ele.isDisplayed())
		{
			System.out.println("Verification Is Done");
			driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
			driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).click();
			driver.findElement(By.xpath("//section[text()='Frames']")).click();
			driver.findElement(By.xpath("//section[text()='iframes']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Multiple iframe')]")).click();
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
			driver.switchTo().frame(iframe);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
			
		}
		else
		{
			System.out.println("Verification Is Not Done");
			driver.close();
		}
		
		

	}

}
