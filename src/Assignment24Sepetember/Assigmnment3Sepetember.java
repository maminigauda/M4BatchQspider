package Assignment24Sepetember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnment3Sepetember {

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
			Thread.sleep(4000);
			driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//section[contains(text(),'Frames')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//section[contains(text(),'iframes')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Nested iframe')]")).click();
			Thread.sleep(4000);
			WebElement iframe= driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
			driver.switchTo().frame(iframe);
			
			WebElement nested_iframe = driver.findElement(By.xpath("(//div[@class='form_container'])[2]/iframe"));
			driver.switchTo().frame(nested_iframe);
			
			driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Admin@1234");
			driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Verification is not Done");
			driver.close();
		}
		//driver.quit();
		
	}

}
