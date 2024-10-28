package Assignment24Sepetember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Sepetember {

	public static void main(String[] args) throws InterruptedException 
	{
				String expected_url="https://demoapps.qspiders.com/";
		        //open the browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//waiting condition
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				//enter into web page
				driver.get("https://demoapps.qspiders.com/");
				String actual_url=driver.getCurrentUrl();
				if(expected_url.equals(actual_url))
				{
					System.out.println("Verification is Done");
					driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
					driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).click();
					driver.findElement(By.xpath("//section[contains(text(),'Frames')]")).click();
					driver.findElement(By.xpath("//section[contains(text(),'iframes')]")).click();
					driver.findElement(By.xpath("//a[text()='Default']")).click();
					WebElement user_name = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
					driver.switchTo().frame(user_name);
					driver.findElement(By.id("username")).sendKeys("Mamini");
					driver.findElement(By.id("password")).sendKeys("Mamini@123");
					driver.findElement(By.id("submitButton")).click();
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Verification is Not Done");
					driver.close();
				}
				driver.quit();
		

	}

}
